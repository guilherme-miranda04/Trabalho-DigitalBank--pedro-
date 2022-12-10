package banco;

import banco.ConexaoBanco;
import classes.Pessoa;
import classes.Cliente;
import classes.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import classes.Endereco;
import classes.Endereco;
import classes.Movimentacao;
import classes.Movimentacao;
import classes.Pessoa;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ClienteDAO extends ConexaoBanco {

    private final ConexaoBanco conexao = new ConexaoBanco();
    private Cliente cliente = new Cliente();

    

    public Pessoa selectCliente(String cpf) throws SQLException {
        Pessoa clienteRet = null;
        try (Statement st = conexao.getConexao().createStatement();
                ResultSet rs = st.executeQuery(
                        "select * from cliente where (cpf = '" + cpf + "')")) {

            while (rs.next()) {

                int id = rs.getInt("ID");
                String nome = rs.getString("nome");
                cpf = rs.getString("cpf");
                Date dataNasc = rs.getDate("dataNasc");
                String sexo = rs.getString("sexo");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                int enderecoID = rs.getInt("ENDERECO_ID");

                
                cliente.setId(id);
                cliente.setNome(nome);
                cliente.setCpf(cpf);
                cliente.setDataNasc(dataNasc);
                cliente.setSexo(sexo);
                cliente.setTelefone(telefone);
                cliente.setEmail(email);
                cliente.setEnderecoID(enderecoID);
            
               

                System.out.println(cliente);
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
   
        
        conexao.close();
        return clienteRet;
    }

}