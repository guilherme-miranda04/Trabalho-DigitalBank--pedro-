package banco;

import classes.Pessoa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import classes.Cliente;
import classes.Endereco;


public class ServicoCliente {

    private final ConexaoBanco conexao = new ConexaoBanco();
    private Endereco endereco = new Endereco();
    private Cliente dadosB = new Cliente();

    public void insert(Pessoa cliente) throws SQLException {
        try (PreparedStatement pst = conexao.getConexao().prepareStatement("insert into cliente (ID, nome, telefone, cpf, dataNasc, email,"
                + "renda, sexo, senha, ENDERECO_ID, DADOS_BANCO_ID) values "
                + "(0, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")) {
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

    public Pessoa select(int cpf) throws SQLException {
        Pessoa clienteRet = null;
        try (Statement st = conexao.getConexao().createStatement();
                ResultSet rs = st.executeQuery(
                        "select * from cliente where (cpf = " + cpf + ")")) {
            rs.first();

            clienteRet = new Pessoa(rs.getInt("ID"),
                    rs.getString("nome"),
                    rs.getString("telefone"),
                    rs.getString("cpf"),
                    rs.getString("dataNasc"),
                    rs.getString("email"),
                    rs.getFloat("renda"),
                    rs.getString("sexo"),
                    rs.getString("senha"),
                    rs.getInt("ENDERECO_ID"),
                    rs.getInt("DADOS_BANCO_ID"));
           
        }
        conexao.close();
        return clienteRet;
    }

    public ArrayList<Pessoa> getClienteByLista() throws SQLException {
        ArrayList<Pessoa> clienteRet = new ArrayList<Pessoa>();
        try (Statement st = conexao.getConexao().createStatement();
                ResultSet rs = st.executeQuery(
                        "select * from cliente order by ID")) {

            while (rs.next()) {
                clienteRet.add(new Pessoa(rs.getInt("ID"),
                    rs.getString("nome"),
                    rs.getString("telefone"),
                    rs.getString("cpf"),
                    rs.getString("dataNasc"),
                    rs.getString("email"),
                    rs.getFloat("renda"),
                    rs.getString("sexo"),
                    rs.getString("senha"),
                    rs.getInt("ENDERECO_ID"),
                    rs.getInt("DADOS_BANCO_ID")));

            }
        }
        conexao.close();
        return clienteRet;
    }

    public void insertEndereco(Endereco endereco) throws SQLException {
        try (PreparedStatement pst = conexao.getConexao().prepareStatement
        ("insert into endereco (ID, estado, cidade, rua, cep, numRua)"
                + " values "
                + "(0, ?, ?, ?, ?, ?)")) {
            pst.setString(1, endereco.getEstado());
            pst.setString(2, endereco.getCidade());
            pst.setString(3, endereco.getRua());
            pst.setString(4, endereco.getCep());
            pst.setString(5, endereco.getNumRua());
  
            pst.executeUpdate();
        }
        conexao.close();
    }

    public Endereco selectEndereco(int id) throws SQLException {
        Endereco enderecoRet = null;
        try (Statement st = conexao.getConexao().createStatement();
                ResultSet rs = st.executeQuery(
                        "select * from cliente where (ID = " + id + ")")) {
            rs.first();

            enderecoRet = new Endereco(rs.getInt("ID"),
                    rs.getString("estado"),
                    rs.getString("cidade"),
                    rs.getString("rua"),
                    rs.getString("cep"),
                    rs.getString("numRua"));
           
        }
        conexao.close();
        return enderecoRet;
    }

    public ArrayList<Endereco> getEnderecoByLista() throws SQLException {
        ArrayList<Endereco> enderecoRet = new ArrayList<Endereco>();
        try (Statement st = conexao.getConexao().createStatement();
                ResultSet rs = st.executeQuery(
                        "select * from endereco order by ID")) {

            while (rs.next()) {
                enderecoRet.add(new Endereco(rs.getInt("ID"),
                    rs.getString("estado"),
                    rs.getString("cidade"),
                    rs.getString("rua"),
                    rs.getString("cep"),
                    rs.getString("numRua")));

            }
        }
        conexao.close();
        return enderecoRet;
    }
    
    public void insertDadosB(Cliente dadosB) throws SQLException {
        try (PreparedStatement pst = conexao.getConexao().prepareStatement
        ("insert into dados_banco (ID, agencia, numconta, tipoconta)"
                + " values "
                + "(0, ?, ?, ?)")) {
            
            pst.setString(1, dadosB.getAgencia());
            pst.setString(2, dadosB.getNumConta());
            pst.setString(3, dadosB.getTipoConta());
  
            pst.executeUpdate();
        }
        conexao.close();
    }

    public Cliente selectDadosB(int numconta) throws SQLException {
        Cliente dadosBRet = null;
        try (Statement st = conexao.getConexao().createStatement();
                ResultSet rs = st.executeQuery(
                        "select * from dados_banco where (numconta = " + numconta + ")")) {
            rs.first();

            dadosBRet = new Cliente(rs.getInt("ID"),
                    rs.getString("agencia"),
                    rs.getString("numconta"),
                    rs.getString("tipoconta"));
           
        }
        conexao.close();
        return dadosBRet;
    }

    public ArrayList<Cliente> getDadosBByLista() throws SQLException {
        ArrayList<Cliente> dadosBRet = new ArrayList<Cliente>();
        try (Statement st = conexao.getConexao().createStatement();
                ResultSet rs = st.executeQuery(
                        "select * from dados_banco order by ID")) {

            while (rs.next()) {
                dadosBRet.add(new Cliente(rs.getInt("ID"),
                    rs.getString("agencia"),
                    rs.getString("numconta"),
                    rs.getString("tipoconta")));

            }
        }
        conexao.close();
        return dadosBRet;
    }
    
    
}
