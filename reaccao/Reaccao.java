package TP1.reaccao;

public class Reaccao implements Comportamento{
	
	private Estimulo estimulo;
	private Accao resposta;

	public Reaccao(Estimulo estimulo, Accao resposta) {
		this.estimulo = estimulo;
		this.resposta = resposta;
	}

	@Override
	public Accao activar(Estimulo estimulo) {
		if(estimulo == this.estimulo) {
			return resposta;
		}
		return null;
	}
	
}
