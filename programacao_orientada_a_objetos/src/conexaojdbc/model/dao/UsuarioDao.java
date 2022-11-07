package conexaojdbc.model.dao;

import conexaojdbc.model.entity.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.dao.ConexaoDao;


public class UsuarioDao {

	public Usuario acessarUsuario(String nome) {

		ConexaoDao conDAO = new ConexaoDao();

		Connection conn = conDAO.iniciarConexao();

		Usuario usuario = null;
		Statement st = null;
		ResultSet resultado = null;

		String cmdSql = "SELECT * FROM loja WHERE nomeUser = '" + nome + "'";

		try {
			st = conn.createStatement();
			resultado = st.executeQuery(cmdSql);

			if (resultado.next()) {
				int id = resultado.getInt("idUser");
				String nomeUsuario = resultado.getString("nomeUser");
				String senha = resultado.getString("senhaUser");

				usuario = new Usuario(id, nomeUsuario, senha);
				System.out.printf("Id: %d \nUsuario: %s \nSenha: %s\n", id, nomeUsuario, senha);
			}

		} catch (SQLException e) {
			System.out.println("Erro de conexão " + e.getMessage());
		}
		
		return usuario;
	}

}