package conexaojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Teste {
	private final static String driver = "com.mysql.cj.jdbc.Driver";
	private final static String servidor = "localhost:3306";
	private final static String banco = "locacao";
	private final static String timezone = "?verifyServerCertificate=false&useSSL=true";
	private final static String url = "jdbc:mysql://" + servidor + "/" + banco + timezone;
	private final static String usuario = "root";
	private final static String senha = "";

	private static Connection conexao = null;

	public static Connection getConexao() {

		System.out.println("Chamando conexao...");
		try {
			Class.forName(driver);
			conexao = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Verificando conexao...");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Erro na conex�o " + e.getMessage());
		}

		System.out.println("Conectado com sucesso...\n");
		return conexao;
	}

}
