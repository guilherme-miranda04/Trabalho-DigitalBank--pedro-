/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import view.FPrincipal;

/**
 *
 * @author guilherme.miranda1
 */
public class Saldo {
    FPrincipal FormPrincipal = new FPrincipal();
    
    public Saldo (String saldoA) {
        FormPrincipal.jTxtPSaldo(saldoA);
    }
}
