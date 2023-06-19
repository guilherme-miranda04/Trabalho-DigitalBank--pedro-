package prbancodigital;

import classes.ControllerLogin;
import view.FLogin;

/**
 *
 * @author guilherme.miranda1
 */

public class PrControleFinanceiro {
    public static void main(String[] args) {
        FLogin FormLogin = new FLogin();

        ControllerLogin controllerloginn = new ControllerLogin(FormLogin);
        FormLogin.setVisible(true);
        FormLogin.setLocationRelativeTo(null);
        FormLogin.jBotLEntrar.addActionListener(controllerloginn);
    }
    
}
