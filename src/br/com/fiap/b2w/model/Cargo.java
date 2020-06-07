package br.com.fiap.b2w.model;

public class Cargo {

	private Colaborador colaborador;
	private Gestor gestor;
	
	public Cargo() {
		
	}
	
	public Cargo(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public Cargo(Gestor gestor) {
		this.gestor = gestor;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}
	
	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public Gestor getGestor() {
		return gestor;
	}

	public void setGestor(Gestor gestor) {
		this.gestor = gestor;
	}

	public void defineCargo(Usuario user, Cargo cargo) {
		user.setCargo(cargo);
	}

	@Override
	public String toString() {
		if (this.colaborador != null) {
			return "Colaborador";
		}
		else if (this.gestor != null) {
			return "Gestor";
		}
		else {
			return null;
		}
	}

}
