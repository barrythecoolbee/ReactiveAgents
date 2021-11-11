package TP1.jogo.ambiente;

import TP1.reaccao.Estimulo;

public enum EventoAmb implements Estimulo{
	SILENCIO,
	RUIDO,
	INIMIGO,
	FUGA,
	VITORIA,
	DERROTA,
	TERMINAR;
}
