/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.FCadastroConta;

/**
 *
 * @author guilherme.miranda1
 */
public class ControllerCadastroConta implements ActionListener {
    FCadastroConta FormCadConta = new FCadastroConta();

    public ControllerCadastroConta(String msg) {
        FormCadConta.setVisible(true);
        FormCadConta.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
