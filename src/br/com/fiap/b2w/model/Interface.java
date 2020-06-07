package br.com.fiap.b2w.model;

import java.util.Scanner;

public class Interface {

	private Usuario user;
	
	public Interface() {
		
	}

	public Interface(Usuario user) {
		this.user = user;
	}

	public void perfilUsuario(Usuario user) {

		Scanner sc = new Scanner(System.in);

		System.out.println("O que você procura? ");
		System.out.println("Ver perfil - 1");
		System.out.println("Ver tarefas - 2");
		int resposta = sc.nextInt();

		if (resposta == 1) {
			System.out.println("Seu perfil:");
			System.out.println(user.consultaPerfil());
		} else if (resposta == 2) {
			System.out.println(user.paraGestor().consultaTarefa());
		}
		sc.close();
	}
	
	public boolean verificaLogin(String login, String senha, Usuario user) {
		if (login.equals(user.getLogin())
				&& senha.equals(user.getSenha())) {
			return true;
		} else {
			return false;
		}
	}
	
	//public senhaIncorreta
}
