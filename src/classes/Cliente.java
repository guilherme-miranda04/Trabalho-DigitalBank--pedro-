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
    private Endereco endereco;
    private int enderecoID;
    private String idendereco;

    private ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

    public Cliente() {
        if(endereco == null){
            endereco = new Endereco();
        }
    }

    public Cliente(String telefone, String email, String senha) {
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
                if(endereco == null){
            endereco = new Endereco();
        }
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getIdendereco() {
        return idendereco;
    }

    public void setIdendereco(String idendereco) {
        this.idendereco = idendereco;
    }
    
    public int getEnderecoID() {
        return enderecoID;
    }

    public void setEnderecoID(int enderecoID) {
        this.enderecoID = enderecoID;
    }

}
