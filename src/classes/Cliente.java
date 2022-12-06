/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Date;

/**
 *
 * @author hercilio.neto1
 */
public class Cliente extends Pessoa {
    
    private int idCli;;
    private String telefone, email, senha;

    public Cliente(int idCli, String telefone, String email, String senha, int id, String nome, String cpf, String sexo, String endereco, Date dataNasc) {
        super(id, nome, cpf, sexo, endereco, dataNasc);
        this.idCli = idCli;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public Cliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int id) {
        this.idCli = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    
   
}
