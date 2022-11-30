
package classes;

import java.util.Date;

/**
 *
 * @author guilherme.miranda1
 */

public class Transferencia {
    private int id, clienteid;
    private String tipoConta, nroConta, descTran;
    private Date dataTran;

    public Transferencia(int id, int clienteid, String tipoConta, String nroConta, String descTran, Date dataTran) {
        this.id = id;
        this.clienteid = clienteid;
        this.tipoConta = tipoConta;
        this.nroConta = nroConta;
        this.descTran = descTran;
        this.dataTran = dataTran;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClienteid() {
        return clienteid;
    }

    public void setClienteid(int clienteid) {
        this.clienteid = clienteid;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getNroConta() {
        return nroConta;
    }

    public void setNroConta(String nroConta) {
        this.nroConta = nroConta;
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
    
    
    
}
