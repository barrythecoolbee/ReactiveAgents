package TP1.jogo.personagem.comport;

import TP1.jogo.ambiente.EventoAmb;
import TP1.maqest.Estado;
import TP1.maqest.MaquinaEstados;
import TP1.reaccao.ComportMaqEst;
import TP1.reaccao.Estimulo;

public class ComportPersonagem extends ComportMaqEst{

	@Override
	protected MaquinaEstados<Estimulo> iniciar() {
		Estado<Estimulo> patrulha = new Estado<Estimulo>("Patrulha");
		Estado<Estimulo> inspeccao = new Estado<Estimulo>("Inspecção");
		Estado<Estimulo> defesa = new Estado<Estimulo>("Defesa");
		Estado<Estimulo> combate = new Estado<Estimulo>("Combate");
		
		patrulha
		.transicao(EventoAmb.INIMIGO, defesa)
		.transicao(EventoAmb.RUIDO, inspeccao)
		.transicao(EventoAmb.SILENCIO, patrulha);
	
		inspeccao
		.transicao(EventoAmb.INIMIGO, defesa)
		.transicao(EventoAmb.RUIDO, inspeccao)
		.transicao(EventoAmb.SILENCIO, patrulha);
		
		defesa
		.transicao(EventoAmb.INIMIGO, combate)
		.transicao(EventoAmb.FUGA, inspeccao);
		
		combate
		.transicao(EventoAmb.INIMIGO, combate)
		.transicao(EventoAmb.DERROTA, patrulha)
		.transicao(EventoAmb.VITORIA, patrulha)
		.transicao(EventoAmb.FUGA, patrulha);
		
		comport(patrulha, new Patrulhar());
		comport(inspeccao, new Inspeccionar());
		comport(defesa, new Defender());
		comport(combate, new Combater());
		
		return new MaquinaEstados<Estimulo>(patrulha);
	}

}
