/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import classes.Cliente;
import classes.Movimentacao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import view.FPrincipal;


public class MovimentacaoDAO extends ConexaoBanco{
    private int getID;
    private final ConexaoBanco conexao = new ConexaoBanco();
    Cliente cliente = new Cliente();
        PreparedStatement psP = null;
        PreparedStatement psE = null;
        PreparedStatement psI = null;
        Connection con = getConexao();
        FPrincipal formularioP = new FPrincipal();
   
        public boolean InserirDadosBancoMovimentacao (Movimentacao movimentacao) {   
        // Seleciona do Banco Clientes a informação *CPF* //
        String sqlMovi = "insert into movimentacao (ID, dataTran, valorTran, debCre, descTran, CLIENTE_ID) values (?,?,?,?,?,?)";
        String sqlCliente = "insert into cliente (ID, nome, cpf, dataNasc, sexo, telefone, email, senha, ENDERECO_ID) values (?,?,?,?,?,?,?,?,?)";
        String sqlIdCliente = "select MAX(e.CLIENTE_ID) from movimentacao e where (CLIENTE_ID = "+ formularioP.txtCli +")";
        
        
        try {
            psE = con.prepareStatement(sqlMovi);
            psP = con.prepareStatement(sqlCliente);
            psI = con.prepareStatement(sqlIdCliente);
            
            // Inserção dados Movimentacao //
            psE.setInt(1, 0);
            psE.setDate(2, (Date) movimentacao.getDataTran());
            psE.setFloat(3, movimentacao.getValorTran());
            psE.setString(4, movimentacao.getDebCre());
            psE.setString(5, movimentacao.getDescTran());
            psE.setString(6, sqlIdCliente);
            psE.executeUpdate();

            close();
            return true;
        } catch (SQLException e) {
            close();
            System.err.println(e);
            return false;
        }
    }
    
    //faz o select quando o id (que esta na tela - txtCli) for igual ao registro do banco
    public Movimentacao selectMovimentacao(int codigo /*passar o txtCli*/)throws SQLException{
         Movimentacao movimentacaoRet = null;
         try(Statement st = conexao.getConexao().createStatement();
             ResultSet rs = st.executeQuery(
                "select * from movimentacao where (CLIENTE_ID = " + codigo + ")")){
               rs.first();
               
               movimentacaoRet = new Movimentacao(rs.getInt("ID"), 
                                                rs.getDate("dataTran"),
                                                rs.getFloat("valorTran"),
                                                rs.getString("debCre"),
                                                rs.getString("descTran"),
                                                rs.getInt("CLIENTE_ID"));
            }
          conexao.close();
          return movimentacaoRet;
     }
    
public ArrayList getEquipamentoByQery(int codigo /*passar o txtCli*/) throws SQLException{
 ArrayList dados = new ArrayList();
        
    try (Statement st = conexao.getConexao().createStatement(); 
            ResultSet rs = st.executeQuery
             ("select *  from movimentacao" +
               "where (CLIENTE_ID = " + codigo + ")")) {
         
        while (rs.next()){
          dados.add(new String [] { rs.getString(1),  
                                    rs.getString(2), 
                                    rs.getString(3),
                                    rs.getString(4),
                                    rs.getString(5)                                     
                                   }); 
        }
    }
    
    return dados;           
  }
}

