package TP1.jogo.personagem;

import TP1.jogo.ambiente.Ambiente;
import TP1.jogo.personagem.comport.ComportPersonagem;
import TP1.reaccao.Accao;
import TP1.reaccao.Comportamento;
import TP1.reaccao.Estimulo;

public class Personagem{
	
	private Ambiente ambiente;
	private Comportamento comportamento;
	private Accao resposta;
	private ComportPersonagem c;
	
	public Personagem(Ambiente ambiente) {
		this.ambiente = ambiente;
		this.c = new ComportPersonagem();
	}
	
	public void executar() {
		Estimulo estimulo = percepcionar();
		resposta = processar(estimulo);
		actuar(resposta);
		mostrar();
	}
	
	private Estimulo percepcionar() {
		Estimulo estimulo = ambiente.getEvento();
		return estimulo;
	}
	
	private Accao processar(Estimulo estimulo) {
		return c.activar(estimulo);
	}
	
	private void actuar(Accao accao) {
		if(accao != null) {
			accao.executar();
		}
	}
	
	private void mostrar() {
		System.out.println(c.getEstado());
	}

}
