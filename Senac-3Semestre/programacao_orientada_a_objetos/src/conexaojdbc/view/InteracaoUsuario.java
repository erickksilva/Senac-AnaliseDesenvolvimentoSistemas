package conexaojdbc.view;

import javax.swing.JOptionPane;

public class InteracaoUsuario {

	public void saudacoes() {
		System.out.println("Olá, seja bem-vindo ao sistema.");
	}

	public String entradaUsuario() {

		String nome = JOptionPane.showInputDialog("Insira seu nome");
		return nome;
	}

}
