package br.com.fiap.scg.dao;

import java.util.HashMap;
import java.util.Map;

import br.com.fiap.scg.beans.Usuario;

public class UsuarioDAO {
	
	private final static Map<String, Usuario> USUARIOS = new HashMap<String, Usuario>();
	static {
		USUARIOS.put("vinicius1504_medeiros@hotmail.com", new Usuario("vinicius1504_medeiros@hotmail.com", "vinicius", "Marcus Vinicius Galdino"));
	}
	
	public Usuario login(Usuario u) {
		
		if(!USUARIOS.containsKey(u.getEmail())) {
			return null;
		}
		
		Usuario usuario = USUARIOS.get(u.getEmail());
		if(u.getSenha().equals(usuario.getSenha())) {
			return usuario;
		}
		
		return null;
	}
	
	
	
	public void adicionar(Usuario u) {
		USUARIOS.put(u.getEmail(), u);
	}
	
	

}
