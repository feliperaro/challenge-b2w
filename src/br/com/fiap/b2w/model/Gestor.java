package br.com.fiap.b2w.model;

public class Gestor extends Cargo {

	private Usuario user;
	private Tarefas tarefa;	

	public Gestor(Usuario user) {
		super();
		this.user = user;
		this.tarefa = null;
	}

	public Usuario getUser() {
		return user;
	}

	public Tarefas getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefas tarefa) {
		this.tarefa = tarefa;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public void criarTarefa(Tarefas tarefa, Colaborador colab) {
		colab.recebeTarefa(this, tarefa);
		this.tarefa = tarefa;
	}
	
	public String consultaTarefa() {
		if (this.tarefa != null) {
			return "\nExistem tarefas a serem cumpridas" + this.getTarefa();
		}
		else {
			return "\nNão existem tarefas a serem cumpridas";
		}
	}

}
