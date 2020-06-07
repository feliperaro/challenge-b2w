package br.com.fiap.b2w.ui;

import java.util.Scanner;

import br.com.fiap.b2w.model.Cargo;
import br.com.fiap.b2w.model.Colaborador;
import br.com.fiap.b2w.model.Gestor;
import br.com.fiap.b2w.model.Tarefas;
import br.com.fiap.b2w.model.Usuario;

public class Interface {

	private Usuario user;

	public Interface() {

	}

	public Interface(Usuario user) {
		this.user = user;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public Usuario cadastroGestor(String login, String senha, String nickname) {
		Usuario user1 = new Usuario(login.strip(), senha.strip(), nickname.strip());
		Cargo cargo = new Cargo(new Gestor(user1));
		cargo.defineCargo(user1, cargo);

		return user1;
	}

	public Usuario cadastroColaborador(String login, String senha, String nickname) {
		Usuario user = new Usuario(login.strip(), senha.strip(), "usuario2");
		Cargo cargo = new Cargo(new Colaborador(user));
		cargo.defineCargo(user, cargo);

		return user;
	}

	public boolean verificaLogin(String login, String senha, Usuario user) {
		if (login.equals(user.getLogin()) && senha.equals(user.getSenha())) {
			return true;
		} else {
			return false;
		}
	}

	public void inicio(Interface ui, Usuario gestor, Usuario colaborador) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre no perfil desejado");
		char resp = 'S';
		while (resp == 'S') {
			System.out.print("\nLogin: ");
			String login = sc.nextLine();

			System.out.print("Senha: ");
			String senha = sc.nextLine();

			if (ui.verificaLogin(login, senha, gestor)) {
				resp = 'N';
				ui.perfilUsuarioGestor(gestor, colaborador);

			} else if (ui.verificaLogin(login, senha, colaborador)) {
				resp = 'N';
				ui.perfilUsuarioColaborador(colaborador, gestor);

			} else {
				System.out.println("\nLogin ou senha incorretos");
				System.out.println("Deseja tentar novamente? (S/N) ");
				resp = sc.nextLine().toUpperCase().charAt(0);
			}
		}
		sc.close();
	}

	public void perfilUsuarioGestor(Usuario gestor, Usuario colab) {
		Scanner sc = new Scanner(System.in);
		boolean ficaNoPerfil = true;
		while (ficaNoPerfil) {
			System.out.println("O que você procura? ");
			System.out.println("Ver perfil - 1");
			System.out.println("Ver tarefas - 2");
			System.out.println("Sair do perfil - 3");
			int resposta = sc.nextInt();
			if (resposta == 1) {
				System.out.println("\nSeu perfil:");
				System.out.println(gestor.consultaPerfil());
			} else if (resposta == 2) {
				if (gestor.paraGestor().getTarefa() == null) {
					System.out.println(gestor.paraGestor().consultaTarefa());

					System.out.println("\nCrie uma tarefa ");
					System.out.print("O que fazer: ");
					String tarefa = sc.nextLine();

					System.out.println("\nPontuação: ");
					sc.nextLine();
					int pontuacao = sc.nextInt();

					Tarefas tare = new Tarefas(tarefa, pontuacao);

					gestor.paraGestor().criarTarefa(tare, colab.paraColaborador());

					System.out.println(gestor.paraGestor().consultaTarefa());
				} else {
					System.out.println(gestor.paraGestor().consultaTarefa());
				}
			} else if (resposta == 3) {
				ficaNoPerfil = false;
				this.inicio(this, gestor, colab);
			}
		}
		sc.close();
	}

	public void perfilUsuarioColaborador(Usuario colaborador, Usuario gestor) {
		Scanner sc = new Scanner(System.in);
		boolean ficaNoPerfil = true;
		while (ficaNoPerfil) {
			System.out.println("O que você procura? ");
			System.out.println("Ver perfil - 1");
			System.out.println("Ver tarefas - 2");
			System.out.println("Sair do perfil - 3");
			int resposta = sc.nextInt();
			if (resposta == 1) {
				System.out.println("\nSeu perfil:");
				System.out.println(colaborador.consultaPerfil());
			} else if (resposta == 2) {
				if (gestor.paraGestor().getTarefa() == null) {
					System.out.println(colaborador.paraColaborador().consultaTarefa());

				} else {
					System.out.println(gestor.paraGestor().consultaTarefa());
					
				}
			} else if (resposta == 3) {
				ficaNoPerfil = false;
				this.inicio(this, gestor, colaborador);
			}
		}
		sc.close();

	}

}
