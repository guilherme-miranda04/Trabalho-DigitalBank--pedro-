package classes;

import banco.ConexaoBanco;
import classes.Pessoa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import classes.Endereco;
import classes.Movimentacao;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ServicoCliente extends ConexaoBanco {

    private final ConexaoBanco conexao = new ConexaoBanco();
    private Endereco endereco = new Endereco();
    private Cliente cliente = new Cliente(0, "", "", "", "", null);

    public void insert(Cliente cliente) throws SQLException {
        try (PreparedStatement pst = conexao.getConexao().prepareStatement("insert into cliente (ID, nome, cpf, dataNasc, sexo, telefone, email,"
                + " senha, ENDERECO_ID) values "
                + "(0, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")) {
            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getCpf());
            pst.setDate(3, new Date(cliente.getDataNasc().getTime()));
            pst.setString(4, cliente.getSexo());
            pst.setString(5, cliente.getTelefone());
            pst.setString(6, cliente.getEmail());
            pst.setString(7, cliente.getSenha());
            pst.setInt(8, endereco.getId());

            pst.executeUpdate();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Pessoa select(int cpf) throws SQLException {
        Pessoa clienteRet = null;
        try (Statement st = conexao.getConexao().createStatement();
                ResultSet rs = st.executeQuery(
                        "select * from cliente where (cpf = " + cpf + ")")) {
            rs.first();

            clienteRet = new Cliente(rs.getInt("ID"),
                    rs.getString("telefone"),
                    rs.getString("email"),
                    rs.getString("senha"),
                    rs.getInt("ENDERECO_ID"),
                    rs.getString("nome"),
                    rs.getString("cpf"),
                    rs.getString("sexo"),
                    rs.getString("ENDERECO_ID"),
                    rs.getDate("dataNasc"));

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
                clienteRet.add(new Cliente(rs.getInt("ID"),
                        rs.getString("telefone"),
                        rs.getString("email"),
                        rs.getString("senha"),
                        rs.getInt("ENDERECO_ID"),
                        rs.getString("nome"),
                        rs.getString("cpf"),
                        rs.getString("sexo"),
                        rs.getString("ENDERECO_ID"),
                        rs.getDate("dataNasc")));
            }//int idCli, String telefone, String email, String senha, int id, String nome, String cpf, String sexo, String endereco, Date dataNasc)
        }
        conexao.close();
        return clienteRet;
    }

    public void insertEndereco(Endereco endereco) throws SQLException {
        try (PreparedStatement pst = conexao.getConexao().prepareStatement("insert into endereco (ID, estado, cidade, rua, cep, numRua)"
                + " values "
                + "(0, ?, ?, ?, ?, ?)")) {
            pst.setString(1, endereco.getEstado());
            pst.setString(2, endereco.getCidade());
            pst.setString(3, endereco.getRua());
            pst.setString(4, endereco.getCep());
            pst.setString(5, endereco.getNumRua());

            pst.executeUpdate();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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

    public void insertMovimentacao(Movimentacao movimentacao) throws SQLException {
        try (PreparedStatement pst = conexao.getConexao().prepareStatement("insert into movimentacao (ID, contaOrigem, dataTran, valorTran,"
                + "debCre, desTran, CLIENTE_ID)"
                + " values "
                + "(0, ?, ?, ?,?,?)")) {

            pst.setInt(1, movimentacao.getContaOrigem());
            pst.setDate(2, (Date) movimentacao.getDataTran());
            pst.setFloat(3, movimentacao.getValorTran());
            pst.setString(4, movimentacao.getDebCre());
            pst.setString(5, movimentacao.getDescTran());
            pst.setInt(6, cliente.getIdCli());

            pst.executeUpdate();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Movimentacao selectMovimentacao(int idCli) throws SQLException {
        Movimentacao movimentacaoRet = null;
        try (Statement st = conexao.getConexao().createStatement();
                ResultSet rs = st.executeQuery(
                        "select * from movimentacao where (numconta = " + idCli + ")")) {
            rs.first();

            movimentacaoRet = new Movimentacao(rs.getInt("ID"),
                    rs.getInt("contaOrigem"),
                    rs.getString("debCre"),
                    rs.getString("descTran"),
                    rs.getDate("dataTran"),
                    rs.getFloat("valorTran"));

        } //(int id, int contaOrigem, String debCre, String descTran, Date dataTran, Float valorTran)
        conexao.close();
        return movimentacaoRet;
    }

    public String getDatetoString(Date dataNasc) {
        Date date = (Date) Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(date);

        return strDate;

    }

    public ArrayList<Movimentacao> getMovimentacaoByLista(int idCli) throws SQLException {
        ArrayList<Movimentacao> movimentacaoRet = new ArrayList<Movimentacao>();
        try (Statement st = conexao.getConexao().createStatement();
                ResultSet rs = st.executeQuery(
                        "select * from registro where contaOrigem = " + idCli
                        + " order by dataTran"
                )) {

            while (rs.next()) {
                movimentacaoRet.add(new Movimentacao(rs.getInt("ID"),
                        rs.getInt("contaOrigem"),
                        rs.getString("debCre"),
                        rs.getString("descTran"),
                        rs.getDate("dataTran"),
                        rs.getFloat("valorTran")));

            }
        }
        conexao.close();
        return movimentacaoRet;
    }

}
