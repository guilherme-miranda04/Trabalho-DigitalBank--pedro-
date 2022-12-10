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
public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private Date dataNasc;
    private String sexo;
    private String telefone;
    private String email;
    private String senha;
    private Endereco endereco;
    private int enderecoID;
    private String idendereco;
   


    private ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

    public Cliente() {
        if(endereco == null){
            endereco = new Endereco(sexo, nome, cpf, cpf, nome);
        }
    }

    public Cliente(String telefone, String email, String senha) {
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
                if(endereco == null){
            endereco = new Endereco(email, email, cpf, cpf, nome);
        }
    }

    public Cliente(int id, String nome, String cpf, Date dataNasc, String sexo, String telefone, String email, String senha, int enderecoID) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.enderecoID = enderecoID;
    }
    
    

    public Cliente(String nome, String cpf, Date dataNasc, String sexo, String telefone, String email, String senha, int enderecoID) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.enderecoID = enderecoID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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
