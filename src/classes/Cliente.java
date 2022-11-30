package classes;

import java.sql.Date;
import java.util.ArrayList;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Calendar;  

public class Cliente {

    private int id;
    private String nome, telefone, cpf, email, sexo, senha, endereco;
    private Date dataNasc;
    private float renda;

    private ArrayList<Cliente> lista = new ArrayList<Cliente>();

    public Cliente(int id, String nome, String telefone, String cpf, String email, String sexo, String senha, String endereco, Date dataNasc, float renda) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
        this.sexo = sexo;
        this.senha = senha;
        this.endereco = endereco;
        this.dataNasc = dataNasc;
        this.renda = renda;
    }

    public Cliente(int aInt, String string, String string0, String string1, String string2, String string3, float aFloat, String string4, String string5, int aInt0, int aInt1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

    public ArrayList getListaClienteToString() {
        ArrayList dados = new ArrayList();

        for (Cliente c : this.getLista()) {
            dados.add(new String[]{Integer.toString(c.getId()),
                c.getNome(), c.getTelefone(),c.getCpf(), 
                c.getDatetoString(dataNasc), c.getEmail(), 
                Float.toString(c.getRenda()),
            c.getSexo(), c.getSenha()
        //, c.getEnderecoID() - Ainda decidindo como implementar isso
        //getDadosBancoID - Ainda decidindo como implementar isso
                            });
        }
        return dados;
    }

     public String getDatetoString(Date dataNasc){  
                Date date = (Date) Calendar.getInstance().getTime();  
                DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
                String strDate = dateFormat.format(date);  
            
                return strDate; 
                 
        }  
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLista(ArrayList<Cliente> lista) {
        this.lista = lista;
    }

    public ArrayList<Cliente> getLista() {
        return lista;
    }

    public void setLista(Cliente periferico) {
        this.lista.add(periferico);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

}
