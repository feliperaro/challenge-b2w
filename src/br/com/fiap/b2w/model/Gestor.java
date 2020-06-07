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

	public void passarTarefa(Tarefas tarefa, Colaborador colab) {
		colab.recebeTarefa(this, tarefa);

	}
	
	public String consultaTarefa() {
		if (this.tarefa != null) {
			return "Você tem tarefas a cumprir\n" + this.getTarefa();
		}
		else {
			return "Você não tem tarefas a cumprir";
		}
	}

}
