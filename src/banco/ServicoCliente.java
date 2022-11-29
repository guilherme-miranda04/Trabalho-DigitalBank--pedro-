package banco;

import classes.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import classes.DadosB;
import classes.Endereco;

/**
 *
 * @author guilherme.miranda1
 */

public class ServicoCliente {

    private final ConexaoBanco conexao = new ConexaoBanco();
    private Endereco endereco = new Endereco();
    private DadosB dadosB = new DadosB();
    
    public void insert (Cliente cliente) throws SQLException{
        try
            (PreparedStatement pst = conexao.getConexao().prepareStatement
            ("insert into cliente (ID, nome, telefone, cpf, dataNasc, email,"
                    + "renda, sexo, senha, ENDERECO_ID, DADOS_BANCO_ID) values " +
             "(0, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")){
            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getTelefone());
            pst.setString(3, cliente.getCpf());
            pst.setDate(4, cliente.getDataNasc());
            pst.setString(5, cliente.getEmail());
            pst.setFloat(6, cliente.getRenda());
            pst.setString(7, cliente.getSexo());
            pst.setString(8, cliente.getSenha());
            pst.setInt(9, endereco.getId());
            pst.setInt(10, dadosB.getId());
            
     
            
            pst.executeUpdate();
           }
           conexao.close();
        }
    
     public void update (Periferico periferico) throws SQLException{
        try
            (PreparedStatement pst = conexao.getConexao().prepareStatement
            ("update periferico set descricao = ?, estado = ?, obs = ? " +
             "where (codigo = ?)")){
            pst.setString(1, periferico.getDescricao());
            pst.setString(2, periferico.getEstado());
            pst.setString(3, periferico.getObs());
            pst.setInt(4, periferico.getCodigo());
            
            pst.executeUpdate();
           }
            conexao.close();
        }
     
     public void delete (Periferico periferico) throws SQLException{
        try
            (PreparedStatement pst = conexao.getConexao().prepareStatement
            ("delete from periferico where (codigo = ?)")){
            pst.setInt(1, periferico.getCodigo());
            
            pst.executeUpdate();
          }
          conexao.close();
        }
     
     public Periferico select(int codigo)throws SQLException{
         Periferico perifericoRet = null;
         try(Statement st = conexao.getConexao().createStatement();
             ResultSet rs = st.executeQuery(
                "select * from periferico where (codigo = " + codigo + ")")){
               rs.first();
               
               perifericoRet = new Periferico(rs.getInt("codigo"), 
                                                rs.getString("descricao"),
                                                rs.getString("estado"),
                                                rs.getString("obs"));
            }
          conexao.close();
          return perifericoRet;
     }
     
     public ArrayList<Periferico> getPerifericoByLista() throws SQLException{
         ArrayList<Periferico> perifericoRet =  new ArrayList<Periferico>();
         try(Statement st = conexao.getConexao().createStatement();
             ResultSet rs = st.executeQuery(
                "select * from periferico order by descricao")){
                              
               while (rs.next()){
                  perifericoRet.add(new Periferico(rs.getInt("codigo"), 
                                                rs.getString("descricao"),
                                                rs.getString("estado"),
                                                rs.getString("obs")));
            
               }
              }
          conexao.close();
          return perifericoRet;
     }
     
}


