/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author hercilio.neto1
 */
public class Cliente extends Pessoa {

    private String telefone;
    private String email;
    private String senha;

    private ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

    public Cliente() {
    }

    public Cliente(String telefone, String email, String senha) {
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    Cliente(int aInt, String string, String string0, String string1, int aInt0, String string2, String string3, String string4, String string5, java.sql.Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }
    
}
