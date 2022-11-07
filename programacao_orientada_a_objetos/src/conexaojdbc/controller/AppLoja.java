package conexaojdbc.controller;

import conexaojdbc.model.bean.UserBean;
import conexaojdbc.model.entity.Usuario;
import conexaojdbc.view.InteracaoUsuario;

public class AppLoja {

    public static void main(String[] args) {

        InteracaoUsuario tela = new InteracaoUsuario();
        tela.saudacoes();
        String nome = tela.entradaUsuario();
        System.out.println(nome);
        try {

            UserBean user = new UserBean();
            Usuario usuarioOk = user.signUsuario(nome);

            if (usuarioOk != null) {
                System.out.println("Acesso Ok \nUsuario logado: " + usuarioOk.getNomeUser());
            } else {
                System.out.println("Usuario não existe.");
            }
        } catch (NullPointerException e) {
            System.out.println("Não foi possivel encontrar");
        }

    }

}
