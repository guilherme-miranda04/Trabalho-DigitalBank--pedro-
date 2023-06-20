/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import classes.Cliente;
import classes.Movimentacao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import view.FPrincipal;

public class MovimentacaoDAO extends ConexaoBanco {

    private final ConexaoBanco conexao = new ConexaoBanco();

    // View
    //FPrincipal formularioP = new FPrincipal();
    public boolean InserirDadosBancoMovimentacao(Movimentacao movimentacao, int id) {
        Connection con = getConexao();
        SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        // Seleciona do Banco Movimentação //
        String sqlMovi = "insert into movimentacao (ID, dataTran, valorTran, debCre, descTran, CLIENTE_ID) values (?,?,?,?,?,?)";
        //String sqlIdCliente = "select MAX(e.CLIENTE_ID) from movimentacao e where (CLIENTE_ID = " + id + ")";

        try {
            PreparedStatement psE = con.prepareStatement(sqlMovi);

            // Inserção dados Movimentacao //
            psE.setInt(1, 0);
            String date = sdf.format(movimentacao.getDataTran());
            psE.setString(2, date);
            psE.setFloat(3, movimentacao.getValorTran());
            psE.setString(4, movimentacao.getDebCre());
            psE.setString(5, movimentacao.getDescTran());
            psE.setInt(6, id);
            psE.executeUpdate();

            close();
            return true;
        } catch (SQLException e) {
            close();
            System.err.println(e);
            return false;
        }
    }

    //faz o select quando o id (que esta na tela - txtCli) for igual ao registro do banco
    public ArrayList<Movimentacao> selectMovimentacao(int id /*passar o txtCli*/) throws SQLException {
        String sql = "select * from movimentacao where (CLIENTE_ID = " + id + ")";
        try (Statement st = conexao.getConexao().createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            ArrayList<Movimentacao> movList = new ArrayList<Movimentacao>();
            while (rs.next()) {
                Movimentacao mov = new Movimentacao(
                        rs.getInt("ID"),
                        rs.getDate("dataTran"),
                        rs.getFloat("valorTran"),
                        rs.getString("categoria"),
                        rs.getString("debCre"),
                        rs.getString("descTran"),
                        rs.getInt("CLIENTE_ID"));
                movList.add(mov);
            }
            return movList;
        } finally {
            conexao.close();
        }
    }

}
