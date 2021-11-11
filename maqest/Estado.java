package TP1.maqest;

import java.util.HashMap;
import java.util.Map;

public class Estado<EV>{
	
	private Map<EV,Estado<EV>> transicoes;
	String nome;
	
	public Estado(String nome) {
		this.nome = nome;
		transicoes = new HashMap<EV,Estado<EV>>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public Estado<EV> processar(EV evento){
		return transicoes.get(evento);
	}
	
	public Estado<EV> transicao(EV evento, Estado<EV> estado){
		transicoes.put(evento, estado);
		return this; //retorno a propria instancia do objeto a ser usado
	}
	
	public String toString() {
		return "Estado: " + nome;
	}
}
