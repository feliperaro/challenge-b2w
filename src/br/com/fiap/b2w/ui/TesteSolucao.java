package br.com.fiap.b2w.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.fiap.b2w.exception.B4aException;
import br.com.fiap.b2w.model.Usuario;

public class TesteSolucao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Interface ui = new Interface();

		try {
			System.out.println("Seja bem vindo a plataforma de gamification da B4A!\n");

			System.out.println("Cadastro do gestor");
			System.out.print("Login: ");
			String login = sc.nextLine();

			System.out.print("Senha: ");
			String senha = sc.nextLine();

			System.out.print("Escolha seu nickname: ");
			String nickname = sc.nextLine();

			Usuario user = ui.cadastroGestor(login, senha, nickname);

			System.out.println("\nCadastro o colaborador");
			System.out.print("Login: ");
			login = sc.nextLine();
			System.out.print("Senha: ");
			senha = sc.nextLine();
			System.out.print("Escolha seu nickname: ");
			nickname = sc.nextLine();

			Usuario user2 = ui.cadastroColaborador(login, senha, nickname);

			ui.inicio(ui, user, user2);

		} catch (B4aException e) {
			System.err.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.err.println("Valor inválido");
		} catch (RuntimeException e) {
			System.err.println("Erro inesperado!");
		} finally {
			sc.close();
		}
	}
}
