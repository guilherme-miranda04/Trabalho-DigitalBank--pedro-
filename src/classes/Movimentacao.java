
package classes;

import java.util.Date;

/**
 *
 * @author guilherme.miranda1
 */

public class Movimentacao {
    private int id, contaOrigem;
    private String  debCre, descTran;
    private Date dataTran;
    private Float valorTran;
    
    
    
    public Movimentacao(int id, int contaOrigem, String debCre, String descTran, Date dataTran, Float valorTran) {
        this.id = id;
        this.contaOrigem = contaOrigem;
        this.debCre = debCre;
        this.descTran = descTran;
        this.dataTran = dataTran;
        this.valorTran = valorTran;
    }

    public Movimentacao() {
    }

   


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(int contaOrigem) {
        this.contaOrigem = contaOrigem;
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
    
    
    
    
}
