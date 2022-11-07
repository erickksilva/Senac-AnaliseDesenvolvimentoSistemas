/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_01_01_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author erick.nsilva2
 */
public class ExemploPreparedStatement {

//    private Connection conexao = null;
    private ResultSet resultado = null;
    private Statement stmt = null;

    public static void main(String[] args) {

        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/aulas", "root", "");

            PreparedStatement ps = conexao.prepareStatement(
                    "INSERT INTO alunos (nomeAluno, telefoneAluno) values ( ?,?) ");

            String nome = JOptionPane.showInputDialog("Insira seu nome.");
            String telefone = JOptionPane.showInputDialog("Insira seu telefone.");
            ps.setString(1, nome);
            ps.setString(2, telefone);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso.");
            ps.close();
            conexao.close();
            System.out.println("Conexão fechada!");
        } catch (SQLException e) {
            System.out.println("");
            System.out.println("Falha ao tentar gravar.");
        }
    }

}
