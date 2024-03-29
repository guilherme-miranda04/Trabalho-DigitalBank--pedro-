/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import classes.Cliente;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class CadastroContaDAO extends ConexaoBanco {

    private int getID;

    public boolean InserirDadosBanco(Cliente cadcliente) {
        Connection con = getConexao();
        SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
        // Seleciona do Banco Clientes a informação *CPF* //
        String sqlEnd = "insert into endereco (ID, cidade, estado, numRua, rua, cep, bairro) values (?,?,?,?,?,?,?)";
        String sqlCliente = "insert into cliente (ID, nome, email, dataNasc, sexo, senha, ENDERECO_ID) values (?,?,?,?,?,?,?)";

        try {
            PreparedStatement psE = con.prepareStatement(sqlEnd,Statement.RETURN_GENERATED_KEYS);
            PreparedStatement psP = con.prepareStatement(sqlCliente);

            // Inserção dados Endereço //
            psE.setInt(1, 0);
            getID = cadcliente.getEnderecoID();
            psE.setString(2, cadcliente.getEndereco().getCidade());
            psE.setString(3, cadcliente.getEndereco().getEstado());
            psE.setString(4, cadcliente.getEndereco().getNumRua());
            psE.setString(5, cadcliente.getEndereco().getRua());
            psE.setString(6, cadcliente.getEndereco().getCep());
            psE.setString(7, cadcliente.getEndereco().getBairro());            
            psE.executeUpdate();
             ResultSet generatedKeys = psE.getGeneratedKeys();
                if (generatedKeys.next()) {
               getID = generatedKeys.getInt(1);
                }

            // Inserção dados Pessoa //
            psP.setInt(1, 0);
            psP.setString(2, cadcliente.getNome());
            psP.setString(3, cadcliente.getEmail());
            String date = sdf.format(cadcliente.getDataNasc());
            psP.setString(4, date);
            psP.setString(5, cadcliente.getSexo());
            psP.setString(6, cadcliente.getSenha());
            psP.setInt(7, getID);
            psP.executeUpdate();
            
            close();
            return true;
        } catch (SQLException e) {
            close();
            System.err.println(e);
            return false;
        }
    }
}