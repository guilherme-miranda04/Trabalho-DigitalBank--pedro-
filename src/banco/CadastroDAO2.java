/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import classes.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastroDAO2 {
    private final Connection connection;

    public CadastroDAO2(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Cliente cliente) throws SQLException{
        String sqlCliente = "insert into cliente (ID, nome, cpf, dataNasc, sexo, "
                + "telefone, email, senha, ENDERECO_ID) values (?,"+cliente.getNome()+","+cliente.getDataNasc()+","
                +","+cliente.getSexo()+","+cliente.getEmail()+","+cliente.getSenha()+","+cliente.getEnderecoID()+")";
        PreparedStatement statement = connection.prepareStatement(sqlCliente);
        statement.execute();

        connection.close();

        
    }
}
