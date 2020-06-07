package br.com.fiap.b2w.model;

public class Usuario {

	private String login;
	private String senha;
	private String nickname;
	private Cargo cargo;

	public Usuario() {

	}

	public Usuario(String login, String senha, String nickname) {
		this.login = login;
		this.senha = senha;
		this.nickname = nickname;
		this.cargo = null;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Cargo getCargo() {
		return this.cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Gestor paraGestor() {
		return this.getCargo().getGestor();
	}

	public Colaborador paraColaborador() {
		return this.getCargo().getColaborador();
	}


	public String consultaPerfil() {
		return "Usuario: " + this.login + " \nSenha: " + this.senha + "\nNickname: " + this.nickname + "\nCargo: "
				+ this.cargo;
	}

}
