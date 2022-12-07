/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import banco.ConexaoBanco;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

/**
 *
 * @author guilherme.miranda1
 */
public class CadastroConta extends ConexaoBanco {
    
    public boolean InserirDadosBanco (Cliente cadcliente, Endereco cadendereco) {
    
        PreparedStatement ps = null;
        Connection con = getConexao();
        
        // Seleciona do Banco Clientes a informação *CPF* //
        String sql = "insert into cliente (ID, nome, cpf, dataNasc, sexo, telefone, email, senha) values (?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, 0);
            ps.setString(2, cadcliente.getNome());
            ps.setString(3, cadcliente.getCpf());
            ps.setDate(4, new Date(cadcliente.getDataNasc().getTime()));
            ps.setString(5, cadcliente.getSexo());
            ps.setString(6, cadcliente.getTelefone());
            ps.setString(7, cadcliente.getEmail());
            ps.setString(8, cadcliente.getSenha());
            
            // Inserção dados Endereço //
            ps.setString(9, cadendereco.getEstado());
            ps.setString(10, cadendereco.getCidade());
            ps.setString(11, cadendereco.getRua());
            ps.setString(12, cadendereco.getCep());
            ps.setString(13, cadendereco.getNumRua());
            
            close();
            return true;
        } catch (SQLException e) {
            close();
            System.err.println(e);
            return false;
        }
    }
}
