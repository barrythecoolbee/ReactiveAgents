package TP1.jogo;

import TP1.jogo.ambiente.Ambiente;
import TP1.jogo.ambiente.EventoAmb;
import TP1.jogo.personagem.Personagem;

public class Jogo {
	
	private static Ambiente ambiente = new Ambiente(); //construtor implicito
	private static Personagem personagem = new Personagem(ambiente); //construtor implicito
	private static EventoAmb evento;
	private static EventoAmb TERMINAR;
	
	private static void executar() {
		do{
			personagem.executar();
			ambiente.evoluir();
			evento = ambiente.getEvento();
		} while(evento!=TERMINAR);
	}
	
	public static void main(String[] args) {
		executar();
	}
}
