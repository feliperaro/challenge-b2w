package br.com.fiap.b2w.ui;

import java.util.Scanner;

import br.com.fiap.b2w.model.Usuario;

public class TesteSolucao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Seja bem vindo a plataforma de gamification da B4A!\n");
		Interface ui = new Interface();

		System.out.println("Primeiro cadastre o gestor");
		System.out.print("Login: ");
		String login = sc.nextLine();
		System.out.print("Senha: ");
		String senha = sc.nextLine();
		System.out.print("Escolha seu nickname: ");
		String nickname = sc.nextLine();

		Usuario user = ui.cadastroGestor(login, senha, nickname);
		System.out.println("\nCadastro feito com sucesso!");

		System.out.println("\nAgora cadastre o colaborador");
		System.out.print("Login: ");
		login = sc.nextLine();
		System.out.print("Senha: ");
		senha = sc.nextLine();
		System.out.print("Escolha seu nickname: ");
		nickname = sc.nextLine();

		Usuario user2 = ui.cadastroColaborador(login, senha, nickname);
		System.out.println("\nCadastro feito com sucesso!\n");

		ui.inicio(ui, user, user2);

		sc.close();
	}

}

/*
 * System.out.println("Entre no perfil desejado"); char resp = 'S'; while (resp
 * == 'S') { System.out.print("\nLogin: "); String login = sc.nextLine();
 * 
 * System.out.print("Senha: "); String senha = sc.nextLine();
 * 
 * if (ui.verificaLogin(login, senha, user)) { resp = 'N';
 * ui.perfilUsuarioGestor(user, user2);
 * 
 * } else if (ui.verificaLogin(login, senha, user2)) { resp = 'N';
 * ui.perfilUsuarioColaborador(user2, user);
 * 
 * } else { System.out.println("\nLogin ou senha incorretos");
 * System.out.println("Deseja tentar novamente? (S/N) "); resp =
 * sc.nextLine().toUpperCase().charAt(0); } }
 * 
 */