/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_01_01_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author erick.nsilva2
 */
public class ConexaoMysql {

    public static void main(String[] args) {
        ConexaoMysql b = new ConexaoMysql();
        b.fabricaDeConexao();
        b.fecharConexao();

    }

    public final static String url = "jdbc:mysql://localhost:3306/aulas";
    public final static String usuario = "root";
    public final static String senha = "";

    private Connection conexao;
    private Statement stmt;
    private ResultSet resultado;

    private String nome = null;
    private String telefone = null;

    public void fabricaDeConexao() {

        System.out.println("Chamando conexão...");

        try {
            conexao = DriverManager.getConnection(url, usuario, senha);

            stmt = conexao.createStatement();
            System.out.println("Conectado com sucesso.");

            String comandoSql = "select alunoID,nomeAluno, telefoneAluno from alunos";
            resultado = stmt.executeQuery(comandoSql);
            while (resultado.next()) {
                int id = resultado.getInt("alunoID");
                nome = resultado.getString("nomeAluno");
                telefone = resultado.getString("telefoneAluno");
//                System.out.println("\nId: " + id);
//                System.out.println("Nome: " + nome);
//                System.out.println("Telefone: " + telefone);
                Aluno aluno = new Aluno(id, nome, telefone);
                System.out.println(aluno.toString());
            }

        } catch (SQLException e) {
            System.out.println(e.getCause().getMessage());
            System.exit(1);
        }

    }

    public void fecharConexao() {
        try {
            conexao.close();
            System.out.println("\nConexão fechada com sucesso...");
        } catch (SQLException e) {
            System.out.println("Erro ao fechar conexão. " + e.getCause().getMessage());
            System.exit(1);
        }
    }
}
