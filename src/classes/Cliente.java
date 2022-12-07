/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author hercilio.neto1
 */
public class Cliente extends Pessoa {

    private int idCli;
    private String telefone, email, senha;
    
    private ArrayList<Cliente> lista = new ArrayList<Cliente>();

    public Cliente() {
    }

    public Cliente(int idCli, String telefone, String email, String senha) {
        this.idCli = idCli;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    Cliente(int aInt, String string, String string0, String string1, int aInt0, String string2, String string3, String string4, String string5, java.sql.Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
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
