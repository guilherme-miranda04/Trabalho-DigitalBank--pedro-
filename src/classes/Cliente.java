/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author hercilio.neto1
 */
public class Cliente extends Pessoa {
    
    private int id;
    private String telefone, email, senha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    
    
    public Cliente(int id, String telefone, String email, String senha, int aInt, String string, String string0, String string1, String string2, String string3, float aFloat, String string4, String string5, int aInt0, int aInt1) {
        super(aInt, string, string0, string1, string2, string3, aFloat, string4, string5, aInt0, aInt1);
        this.id = id;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }
   
}
