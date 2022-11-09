/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancodados.Controller;

import bancodados.Model.Bean.UserBean;
import bancodados.Model.entity.Usuario;
import bancodados.View.InteracaoUsuario;

/**
 *
 * @author erick.nsilva2
 */
public class AppLoja {

    public static void main(String[] args) {

        InteracaoUsuario tela = new InteracaoUsuario();
        tela.boasVindas();

        String nomeUsuario = tela.entradaUsuario();
        System.out.println(nomeUsuario);

        UserBean user = new UserBean();
        Usuario usuarioOk = user.signInUsuario(nomeUsuario);

        if (usuarioOk != null) {
            System.out.println("Usuario existe.");
        } else {
            System.out.println("Usuario não existe.");
        }

    }
}
