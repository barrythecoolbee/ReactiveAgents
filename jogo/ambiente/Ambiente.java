package TP1.jogo.ambiente;

import java.util.Scanner;

public class Ambiente{
	private EventoAmb evento;
	Scanner sc = new Scanner(System.in);
	String estado;

	public Ambiente() {}
	
	public void evoluir() {
		evento = gerarEvento();
		mostrar();
	}
	
	public EventoAmb getEvento() {
		return evento;
	}
	
	private EventoAmb gerarEvento() {
		//Obter comando
		System.out.println("\nEvento? ");
		estado = sc.next();
				
		//Gerar evento a partir do comando
		switch(estado) {
			case "s":
				evento = EventoAmb.SILENCIO;
				break;
			
			case "r":
				evento = EventoAmb.RUIDO;
				break;
			
			case "i":
				evento = EventoAmb.INIMIGO;
				break;
				
			case "f":
				evento = EventoAmb.FUGA;
				break;
				
			case "v":
				evento = EventoAmb.VITORIA;
				break;
				
			case "d":
				evento = EventoAmb.DERROTA;
				break;
				
			case "t":
				evento = EventoAmb.TERMINAR;
				break;
		}
		return evento;
	}
	
	private void mostrar() {
		System.out.println("Evento: " + evento);
	}
	
}