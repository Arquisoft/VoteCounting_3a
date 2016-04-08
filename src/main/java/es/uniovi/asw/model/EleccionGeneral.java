package es.uniovi.asw.model;

public class EleccionGeneral extends Eleccion{
	private EleccionSenado senado;
	private EleccionCongreso congreso;
	
	public EleccionSenado getSenado() {
		return senado;
	}
	public void setSenado(EleccionSenado senado) {
		this.senado = senado;
	}
	public EleccionCongreso getCongreso() {
		return congreso;
	}
	public void setCongreso(EleccionCongreso congreso) {
		this.congreso = congreso;
	}
}
