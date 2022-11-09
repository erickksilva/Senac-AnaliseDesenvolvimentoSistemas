package conexaojdbc.model.entity;

public class Usuario {
	private String nomeUser, senhaUser;
	private int idUser;

	public Usuario() {
	}

	public Usuario(int idUser, String nomeUser, String senhaUser) {
		this.idUser = idUser;
		this.nomeUser = nomeUser;
		this.senhaUser = senhaUser;
	}

	public String getNomeUser() {
		return nomeUser;
	}

	public void setNomeUser(String nomeUser) {
		this.nomeUser = nomeUser;
	}

	public String getSenhaUser() {
		return senhaUser;
	}

	public void setSenhaUser(String senhaUser) {
		this.senhaUser = senhaUser;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

}
