package conexaojdbc.model.bean;

import conexaojdbc.model.dao.UsuarioDao;
import conexaojdbc.model.entity.Usuario;

public class UserBean {

	public Usuario signUsuario(String nome) {
		UsuarioDao user = new UsuarioDao();
		Usuario usuario = user.acessarUsuario(nome);
		return usuario;
	}

}
