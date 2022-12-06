/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import classes.Login;
import banco.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author guilherme.miranda1
 */
public class LoginDAO extends ConexaoBanco {
    
    public boolean ValidarLogin(Login login) {
        boolean encontrado = false;
        PreparedStatement ps = null;
        Connection con = getConexao();
        ResultSet rs = null;
        
        // Seleciona do Banco Clientes a informação *CPF* //
        String sql = "select * from cliente where cpf = '" + login.getCpf()+"'";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs != null && rs.next()) {
                String cpf = rs.getString("Senha");
                encontrado = cpf.equals(login.getSenha());
            }
            close();
            
        } catch (SQLException e) {
            close();
            System.err.println(e);
        }
        return encontrado;
    }
}
