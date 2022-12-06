/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.FPrincipal;

/**
 *
 * @author guilherme.miranda1
 */
public class ControllerPrincipal implements ActionListener {
    FPrincipal FormPrincipal = new FPrincipal();
    
    public ControllerPrincipal(String msg) {
        FormPrincipal.setVisible(true);
        FormPrincipal.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
