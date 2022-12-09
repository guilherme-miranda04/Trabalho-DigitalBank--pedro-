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
public class Endereco {

    private int id;
    private String estado;
    private String cidade;
    private String rua;
    private String cep;
    private String numRua;
    
    private ArrayList<Endereco> listaEndereco = new ArrayList<Endereco>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumRua() {
        return numRua;
    }

    public void setNumRua(String numRua) {
        this.numRua = numRua;
    }

    public ArrayList<Endereco> getListaEndereco() {
        return listaEndereco;
    }

    public void setListaEndereco(ArrayList<Endereco> listaEndereco) {
        this.listaEndereco = listaEndereco;
    }


}
