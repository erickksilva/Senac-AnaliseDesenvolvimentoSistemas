/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancodados.Model.Bean;

import bancodados.Model.entity.Usuario;
import bancodados.Model.DAO.UsuarioDao;

/**
 *
 * @author erick.nsilva2
 */
public class UserBean {

    public Usuario signInUsuario(String nome) {
        UsuarioDao user = new UsuarioDao();
        Usuario usuario = user.acessarUsario(nome);
        return usuario;
    }
}
