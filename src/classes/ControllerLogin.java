/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import banco.LoginDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.FLogin;

/**
 *
 * @author guilherme.miranda1
 */
public class ControllerLogin implements ActionListener {

    Login login = new Login();
    LoginDAO logindao = new LoginDAO();
    FLogin FormLogin = new FLogin();

    public ControllerLogin(FLogin pTelaLogin) {
        FormLogin = pTelaLogin;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean loginSucesso;

        login.setCpf(FormLogin.jCampoLCPF.getText());
        login.setSenha(String.valueOf(FormLogin.jCampoLSenha.getPassword()));

        loginSucesso = logindao.ValidarLogin(login);

        if (loginSucesso) {
            ControllerPrincipal cPrincipal = new ControllerPrincipal("Cadastro");
        } else {
            ControllerCadastroConta cCriateConta = new ControllerCadastroConta("falha ao logar");
        }

    }
}
