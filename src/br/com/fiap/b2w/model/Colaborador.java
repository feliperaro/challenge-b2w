package br.com.fiap.b2w.model;

public class Colaborador extends Cargo {

	private Usuario user;
	private Tarefas tarefa;

	public Colaborador(Usuario user) {
		super();
		this.user = user;
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

	public void recebeTarefa(Gestor gestor, Tarefas tarefa) {
		this.setTarefa(tarefa);
	}

	public boolean concluirTarefa(Tarefas tarefa, boolean concluida, Usuario gestor) {
		if (concluida) {
			this.setTarefa(null);
			gestor.paraGestor().setTarefa(null);
			return true;
		} else {
			this.setTarefa(tarefa);
			gestor.paraGestor().setTarefa(tarefa);
			return false;
		}
			
	}

	public String consultaTarefa() {
		if (this.tarefa != null) {
			return "Você tem tarefas a cumprir\n" + this.tarefa;
		}
		else {
			return "Você não tem tarefas a cumprir";
		}
	}
}
