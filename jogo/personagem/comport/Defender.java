package TP1.jogo.personagem.comport;

import TP1.jogo.ambiente.AccaoAmb;
import TP1.jogo.ambiente.EventoAmb;
import TP1.reaccao.ComportHierarq;
import TP1.reaccao.Comportamento;
import TP1.reaccao.Reaccao;

public class Defender extends ComportHierarq{
	public Defender() { //associar reações
		super(new Comportamento[] {
			new Reaccao(EventoAmb.INIMIGO, AccaoAmb.DEFENDER),
		});
	}
}
