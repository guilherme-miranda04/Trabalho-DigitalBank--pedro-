package classes;

import java.sql.Date;
import java.util.ArrayList;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Calendar;  

public class Pessoa {

    private int id;
    private String nome, cpf, sexo, endereco;
    private Date dataNasc;
    
    
    private ArrayList<Pessoa> lista = new ArrayList<Pessoa>();


    public Pessoa(int aInt, String string, String string0, String string1, String string2, String string3, float aFloat, String string4, String string5, int aInt0, int aInt1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

    public ArrayList getListaClienteToString() {
        ArrayList dados = new ArrayList();

        for (Pessoa c : this.getLista()) {
            dados.add(new String[]{Integer.toString(c.getId()),
                c.getNome(),c.getCpf(), 
                c.getDatetoString(dataNasc),
                c.getSexo(),c.getEndereco()
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

    public Pessoa(int id, String nome, String cpf, String sexo, String endereco, Date dataNasc) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.endereco = endereco;
        this.dataNasc = dataNasc;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public ArrayList<Pessoa> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Pessoa> lista) {
        this.lista = lista;
    }
    
    
   

}
