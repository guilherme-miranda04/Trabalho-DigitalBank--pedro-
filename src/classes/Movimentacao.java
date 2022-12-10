
package classes;

import java.util.Date;

/**
 *
 * @author guilherme.miranda1
 */

public class Movimentacao {
    private int id;
    private Date dataTran;
    private Float valorTran;
    private String  debCre, descTran;
    private int idCli;

    public Movimentacao(int id, Date dataTran, Float valorTran, String debCre, String descTran, int idCli) {
        this.id = id;
        this.dataTran = dataTran;
        this.valorTran = valorTran;
        this.debCre = debCre;
        this.descTran = descTran;
        this.idCli = idCli;
    }

 
    public Movimentacao() {
    }

    public Movimentacao(int aInt, java.sql.Date date, float aFloat, String string, String string0, int aInt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDebCre() {
        return debCre;
    }

    public void setDebCre(String debCre) {
        this.debCre = debCre;
    }

    public String getDescTran() {
        return descTran;
    }

    public void setDescTran(String descTran) {
        this.descTran = descTran;
    }

    public Date getDataTran() {
        return dataTran;
    }

    public void setDataTran(Date dataTran) {
        this.dataTran = dataTran;
    }

    public Float getValorTran() {
        return valorTran;
    }

    public void setValorTran(Float valorTran) {
        this.valorTran = valorTran;
    }
    
    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }
    
    
}
