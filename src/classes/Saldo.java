/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import banco.MovimentacaoDAO;
import view.FPrincipal;

/**
 *
 * @author guilherme.miranda1
 */
public class Saldo extends MovimentacaoDAO{
    FPrincipal FormPrincipal = new FPrincipal();
    MovimentacaoDAO movimentacao = new MovimentacaoDAO();
    public Saldo (String saldoA) {
        
        FormPrincipal.jTxtPSaldo(saldoA);
    }
    public void VerificacaoSaldo() {
        
    }
}
