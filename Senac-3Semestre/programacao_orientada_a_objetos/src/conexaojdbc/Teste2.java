package conexaojdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Teste2 {

    public static void main(String[] args) {

        Connection conexao = Teste.getConexao();

        try {
            String comandoSql = "SELECT * FROM loja";
            Statement st = conexao.createStatement();

            ResultSet resultado = st.executeQuery(comandoSql);
            while (resultado.next()) {
                int id = resultado.getInt("idUser");
                String nome = resultado.getString("nomeUser");
                String senha = resultado.getString("senhaUser");
                System.out.printf("Id: %d, Usuario: %s, Senha: %s\n", id, nome, senha);
            }

        } catch (SQLException e) {
            System.out.println("Erro de conexao " + e.getMessage());
        }

    }
}
