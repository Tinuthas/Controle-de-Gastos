package br.com.fiap.scg.dao;

import java.util.HashMap;
import java.util.Map;

import br.com.fiap.scg.beans.Conta;
import br.com.fiap.scg.beans.Gasto;
import br.com.fiap.scg.beans.Usuario;

public class ContaDAO {
	
	private final static Map<String, Conta> CONTAS = new HashMap<String, Conta>();
	static {
		CONTAS.put("vinicius1504_medeiro@hotmail.com", new Conta(
				new Usuario(), 
				0, 0, 0, 0, 0, 500));
	}
	
	public Conta buscaConta(Usuario u) {
		if(!CONTAS.containsKey(u.getEmail())) {
			return null;
		}
		Conta c = (Conta) CONTAS.get(u.getEmail());
		return c;
	}
	
	public Conta atualizarValorGasto(Gasto g) {
		if(!CONTAS.containsKey(g.getConta().getUsuario().getEmail())) {
			return null;
		}
		Conta c = (Conta) CONTAS.get(g.getConta().getUsuario().getEmail());
		c.setGastoTotal(c.getGastoTotal() + g.getValorGasto());
		c.setValorConta(c.getValorConta() - g.getValorGasto());
		CONTAS.put(g.getConta().getUsuario().getEmail(), c);
		return c;
	}
	
	public Conta atualizarValorSoma(double valor, Usuario u) {
		if(!CONTAS.containsKey(u.getEmail())) {
			return null;
		}
		Conta c = (Conta) CONTAS.get(u.getEmail());
		c.setValorConta(c.getValorConta()+valor);
		
		return c;
	}

}
