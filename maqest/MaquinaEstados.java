package TP1.maqest;

public class MaquinaEstados<EV> { //a classe utiliza o tipo generico EV
	
	private Estado<EV> estado;

	public MaquinaEstados(Estado<EV> estado) { //instanciação do tipo
		this.estado = estado;
	}
	
	public Estado<EV> getEstado(){
		return estado;
	}
	
	public void processar(EV evento) {
		Estado<EV> novoEstado = estado.processar(evento); //encapsular e reduzir complexidade
		if(novoEstado != null) {
			estado = novoEstado;
		}
	}

}
