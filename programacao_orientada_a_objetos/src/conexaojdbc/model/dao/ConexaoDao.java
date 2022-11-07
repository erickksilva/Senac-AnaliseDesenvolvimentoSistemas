package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDao implements AutoCloseable {

	private final static String driver = "com.mysql.cj.jdbc.Driver";
	private final static String servidor = "localhost:3306";
	private final static String banco = "locacao";
	private final static String timezone = "?verifyServerCertificate=false&useSSL=true";
	private final static String url = "jdbc:mysql://" + servidor + "/" + banco + timezone;
	private final static String usuario = "root";
	private final static String senha = "";

	public Connection iniciarConexao() {
		System.out.println("\nIniciando conex�o...");

		Connection conexao = null;
		try {
			System.out.println("Verificando conexao...");
			Class.forName(driver);
			conexao = DriverManager.getConnection(url, usuario, senha);

		} catch (IllegalArgumentException | SQLException | ClassNotFoundException e) {
			System.out.println("Erro de conexão " + e.getMessage());
		}
		System.out.println("conectado com sucesso.\n");
		return conexao;
	}

	@Override
	public void close() throws Exception {
		System.out.println("Fechando conexão...");
	}

}
