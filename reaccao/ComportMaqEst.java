package TP1.reaccao;

import java.util.HashMap;
import java.util.Map;

import TP1.maqest.Estado;
import TP1.maqest.MaquinaEstados;

public abstract class ComportMaqEst implements Comportamento{
	
	private MaquinaEstados<Estimulo> maqEst;
	private Map<Estado, Comportamento> comportamentos;
	//estar associados a cada estado
	
	public ComportMaqEst() {
		comportamentos = new HashMap<Estado, Comportamento>();
		maqEst = iniciar();
	}
	
	public Estado<Estimulo> getEstado(){
		return maqEst.getEstado();
	}
	
	protected abstract MaquinaEstados<Estimulo> iniciar();
	
	public Accao activar(Estimulo estimulo) {
		Comportamento comportamento = comportamentos.get(maqEst.getEstado());
		Accao accao = null;
		if(comportamento != null) {
			accao = comportamento.activar(estimulo);
		}
		maqEst.processar(estimulo);
		return accao;
	}
	
	public ComportMaqEst comport(Estado<Estimulo> estado, Comportamento comport) {
		comportamentos.put(estado, comport);
		return this;
	}

}
