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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erick.nsilva2
 */
public class ExemploPreparedStatement2 {

//    private Connection conexao = null;
    private ResultSet resultado = null;
    private Statement stmt = null;

    public static void main(String[] args) {

        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/aulas", "root", "");

            Statement stmt = conexao.createStatement();

            ResultSet resultado = stmt.executeQuery(
                    "SELECT alunoID, nomeAluno, telefoneAluno FROM alunos");

            System.out.println("\nLendo registros");

            while (resultado.next()) {
                Aluno aluno = new Aluno(resultado.getInt("alunoID"),
                        resultado.getString("nomeAluno"), resultado.getString("telefoneAluno"));

                System.out.println(aluno);
            }

            resultado.close();
            conexao.close();
            stmt.close();
            System.out.println("\nConexão fechada!");
        } catch (SQLException e) {
            System.out.println("");
            System.out.println("Falha ao ler registros." + e.getCause().getLocalizedMessage());
        }
    }

}
