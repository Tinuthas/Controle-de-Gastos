package br.com.fiap.scg.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.fiap.scg.beans.Gasto;
import br.com.fiap.scg.beans.Usuario;

public class GastoDAO {
	
	private final static Map<String, List<Gasto>> GASTOS = new HashMap<String, List<Gasto>>(); 
	static {
		
	}
	
	public void inserirGasto(Gasto g) {
		
		List<Gasto> listaGasto = new ArrayList<Gasto>();
		
		
		listaGasto.add(g);
		
		GASTOS.put(g.getConta().getUsuario().getEmail(), listaGasto );
		
	}
	
	public Map<String, List<Gasto>> buscaGasto(Usuario u) {
		
		if(!GASTOS.containsKey(u.getEmail())) {
			return null;
		}
		
	
		Map<String, List<Gasto>> listaGasto = (Map<String, List<Gasto>>) GASTOS.get(u.getEmail());
		if(listaGasto != null) {
			return listaGasto;
		}
		
		
		return null;
	}

}
