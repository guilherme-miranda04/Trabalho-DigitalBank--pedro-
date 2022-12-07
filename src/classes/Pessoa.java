package classes;

import java.util.ArrayList;
import java.util.Date;

public class Pessoa {

    private int id;
    private String nome, cpf, sexo;
    private Date dataNasc;

    private ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();

//    public Pessoa(int aInt, String string, String string0, String string1, String string2, String string3, String string4, float aFloat, String string5, int aInt0) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    public ArrayList getListaClienteToString() {
//        ArrayList dados = new ArrayList();
//
//        for (Pessoa c : this.getLista()) {
//            dados.add(new String[]{Integer.toString(c.getId()),
//                c.getNome(), c.getCpf(),
//                c.getDatetoString(dataNasc),
//                c.getSexo(), c.getEndereco()
//            //, c.getEnderecoID() - Ainda decidindo como implementar isso
//            //getDadosBancoID - Ainda decidindo como implementar isso
//            });
//        }
//        return dados;
//    }
//    public String getDatetoString(Date dataNasc) {
//        Date date = (Date) Calendar.getInstance().getTime();
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
//        String strDate = dateFormat.format(date);
//
//        return strDate;
//
//    }
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

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public ArrayList<Pessoa> getListaPessoa() {
        return listaPessoa;
    }

    public void setListaPessoa(ArrayList<Pessoa> listaPessoa) {
        this.listaPessoa = listaPessoa;
    }

}
