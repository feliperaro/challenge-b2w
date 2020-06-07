package br.com.fiap.b2w.model;

import java.util.Scanner;

public class TesteSolucao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Seja bem vindo a plataforma de gamification da B4A!\n");

//		System.out.println("Primeiro cadastre o gestor");
//		System.out.print("Login: ");
//		String login = sc.nextLine();
//
//		System.out.print("Senha: ");
//		String senha = sc.nextLine();
//
//		System.out.print("Escolha seu nickname: ");
//		String nickname = sc.nextLine();

//		Usuario user1 = new Usuario(login.strip(), senha.strip(), "usuario1");
		Usuario user1 = new Usuario("gestor", "123", "felps");
		Cargo cargo = new Cargo(new Gestor(user1));
		cargo.defineCargo(user1, cargo);

		System.out.println("\nCadastro feito com sucesso!");

//		System.out.println("\nAgora cadastre o colaborador");
//		System.out.print("Login: ");
//		login = sc.nextLine();
//
//		System.out.print("Senha: ");
//		senha = sc.nextLine();
//
//		System.out.print("Escolha seu nickname: ");
//		nickname = sc.nextLine();
//
//		Usuario user2 = new Usuario(login.strip(), senha.strip(), "usuario2");
		Usuario user2 = new Usuario("colaborador", "123", "colaborador");
		Cargo cargo2 = new Cargo(new Colaborador(user2));
		cargo2.defineCargo(user2, cargo2);

		System.out.println("\nCadastro feito com sucesso!\n");

		System.out.println("Agora entre com o login desejado");

		char resp = 'S';
		while (resp == 'S') {
			Interface ui = new Interface();
//			System.out.print("\nLogin: ");
//			login = sc.nextLine();
//
//			System.out.print("Senha: ");
//			senha = sc.nextLine();

			if (ui.verificaLogin("gestofr", "123", user1)) {
				resp = 'N';			
				ui.perfilUsuario(user1);

			} else if (ui.verificaLogin("colaborador", "123", user2)) {
				resp = 'N';		
				ui.perfilUsuario(user2);

			} else {
				System.out.println("\nLogin ou senha incorretos");
				System.out.println("Deseja tentar novamente? (S/N) ");
				resp = sc.nextLine().toUpperCase().charAt(0);
			}

//			System.out.println("Deseja continuar no programa? (S/N)");
//			resp = sc.nextLine().toUpperCase().charAt(0);
		}

//


//
//		System.out.println(user2.paraColaborador().consultaTarefa());
//
		sc.close();
	}

}
