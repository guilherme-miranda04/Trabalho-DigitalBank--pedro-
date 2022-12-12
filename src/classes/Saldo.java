/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import banco.ConexaoBanco;
import java.sql.*;
import view.FPrincipal;

/**
 *
 * @author guilherme.miranda1
 */
public class Saldo {

    FPrincipal FormPrincipal = new FPrincipal();
    private final ConexaoBanco conexao = new ConexaoBanco();

    public Saldo(String saldoA) {

        FormPrincipal.jTxtPSaldo(saldoA);
    }

    public Saldo() {
        
    }

    public float VerificacaoSaldo(int id) {
        String sqlsaldo = "select * from VWSALDO where (CLIENTE_ID = " + id + ")";
        try (Statement st = conexao.getConexao().createStatement();
                ResultSet rs = st.executeQuery(sqlsaldo)) {
            if (rs.next()) {
              float saldo = rs.getFloat("credito.vlre-Debito.vlrs");
              return saldo;              
            }
            return 0;
        } catch (SQLException e) {
            return 0;
        }
        finally{
            conexao.close();
        }

    }
}
