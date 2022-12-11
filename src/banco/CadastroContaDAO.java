/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import classes.Cliente;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CadastroContaDAO extends ConexaoBanco {

    private int getID;

    public boolean InserirDadosBanco(Cliente cadcliente) {
        Connection con = getConexao();

        // Seleciona do Banco Clientes a informação *CPF* //
        String sqlEnd = "insert into endereco (ID, estado, cidade, rua, cep, numRua) values (?,?,?,?,?,?)";
        String sqlCliente = "insert into cliente (ID, nome, cpf, dataNasc, sexo, telefone, email, senha, ENDERECO_ID) values (?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement psE = con.prepareStatement(sqlEnd);
            PreparedStatement psP = con.prepareStatement(sqlCliente);

            // Inserção dados Endereço //
            psE.setInt(1, 0);
            getID = cadcliente.getId();
            psE.setString(2, cadcliente.getEndereco().getEstado());
            psE.setString(3, cadcliente.getEndereco().getCidade());
            psE.setString(4, cadcliente.getEndereco().getRua());
            psE.setString(5, cadcliente.getEndereco().getCep());
            psE.setString(6, cadcliente.getEndereco().getNumRua());
            psE.executeUpdate();

            // Inserção dados Pessoa //
            psP.setInt(1, 0);
            psP.setString(2, cadcliente.getNome());
            psP.setString(3, cadcliente.getCpf());
            psP.setDate(4, (java.sql.Date) cadcliente.getDataNasc());
            psP.setString(5, cadcliente.getSexo());
            psP.setString(6, cadcliente.getTelefone());
            psP.setString(7, cadcliente.getEmail());
            psP.setString(8, cadcliente.getSenha());
            psP.setInt(9, getID);
            psP.executeUpdate();
            
            close();
            return true;
        } catch (SQLException e) {
            close();
            System.err.println(e);
            return false;
        }
    }
    
    public boolean ResultDadosBanco(Cliente cadcliente) {
        Connection con = getConexao();
        
        String sqlIdEndereco = "select e.ID from endereco e order by e.id desc limit 1";
        
        try {
            PreparedStatement psI = con.prepareStatement(sqlIdEndereco);
            
            psI.setString(1, sqlIdEndereco);
            
            close();
            return true;
        } catch (SQLException e) {
            close();
            System.err.println(e);
            return false;
        }
    }
}
