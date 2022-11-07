/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancodados.Model.DAO;

import bancodados.Model.entity.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author erick.nsilva2
 */
public class UsuarioDao {

    public Usuario acessarUsario(String nomeUser) {

        ConectarDAO conDAO = new ConectarDAO();

        Connection conn = conDAO.FazerConexao();

        Usuario usuario = null;

        String sql = "SELECT * FROM user WHERE nomeuser = '" + nomeUser + "'";

        java.sql.Statement stmt = null;

        ResultSet resultSet = null;

        try {

            stmt = conn.createStatement();
            resultSet = stmt.executeQuery(sql);
            System.out.println("chamar sql");
            if (resultSet.next()) {

                int id = resultSet.getInt("idUser");

                String nomeUsuario = resultSet.getString("nomeUser");
                String senhaUser = resultSet.getString("senhaUser");
                usuario.setIdUser(usuario.getIdUser());
                usuario.setNomeUser(nomeUser);
                usuario.setSenhaUser(senhaUser);
            }

        } catch (SQLException e) {

            System.out.println("Erro na execução do Selelct " + sql + e);
        }
        System.out.println("Acesso OK");

        return usuario;

    }
}
