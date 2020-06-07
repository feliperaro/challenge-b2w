package br.com.fiap.b2w.model;

public class Tarefas {

	private String tarefa;
	private int pontuacao;

	public Tarefas(String tarefa, int pontuacao) {
		this.tarefa = tarefa;
		this.pontuacao = pontuacao;
	}

	public String getTarefa() {
		return tarefa;
	}

	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	@Override
	public String toString() {
		return "Tarefa:\n" + this.tarefa + " valendo " + this.pontuacao + " pontos.";
	}

}
