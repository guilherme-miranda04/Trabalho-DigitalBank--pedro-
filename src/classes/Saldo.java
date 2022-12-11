/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import banco.MovimentacaoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import view.FPrincipal;

/**
 *
 * @author guilherme.miranda1
 */
public class Saldo extends MovimentacaoDAO{
    FPrincipal FormPrincipal = new FPrincipal();
    public Saldo (String saldoA) {
        
        FormPrincipal.jTxtPSaldo(saldoA);
    }
    public void VerificacaoSaldo(int IdConta) {
        Connection con = getConexao();
        
        String sqlsaldo = "select * from VWSALDO where CLIENTE_ID = ?";
        
        try{        
            PreparedStatement psE = con.prepareStatement(sqlsaldo);
        }catch {
                
        }
        
    }
}
