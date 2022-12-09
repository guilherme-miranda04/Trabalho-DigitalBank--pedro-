/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import classes.Cliente;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

/**
 *
 * @author guilherme.miranda1
 */
public class CadastroContaDAO extends ConexaoBanco {
    private int getID;
    public boolean InserirDadosBanco (Cliente cadcliente) {
    
        PreparedStatement psP = null;
        PreparedStatement psE = null;
        PreparedStatement psI = null;
        Connection con = getConexao();
        
        
        // Seleciona do Banco Clientes a informação *CPF* //
        String sqlEnd = "insert into endereco (ID, estado, cidade, rua, cep, numRua) values (?,?,?,?,?,?)";
        String sqlCliente = "insert into cliente (ID, nome, cpf, dataNasc, sexo, telefone, email, senha, ENDERECO_ID) values (?,?,?,?,?,?,?,?,?)";
        String sqlIdEndereco = "select MAX(e.ID) from endereco e";
        
        try {
            psE = con.prepareStatement(sqlEnd);
            psP = con.prepareStatement(sqlCliente);
            psI = con.prepareStatement(sqlIdEndereco);
            
            // Inserção dados Endereço //
            psE.setInt(1, 0);
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
            psP.setDate(4, new Date(cadcliente.getDataNasc().getTime()));
            psP.setString(5, cadcliente.getSexo());
            psP.setString(6, cadcliente.getTelefone());
            psP.setString(7, cadcliente.getEmail());
            psP.setString(8, cadcliente.getSenha());
            psP.setString(9,sqlIdEndereco);
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
