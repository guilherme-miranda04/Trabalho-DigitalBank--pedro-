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
     //FormPrincipal = new FPrincipal();
    int clinteID = 0;
    
    public ControllerPrincipal(int idcliente) {
        clinteID = idcliente;
        FPrincipal FormPrincipal = new FPrincipal();
        FormPrincipal.setLocationRelativeTo(null);
        FormPrincipal.txtCli.setText(Integer.toString(clinteID));        
        FormPrincipal.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
