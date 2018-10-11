package br.com.fiap.scg.beans;

public class Usuario {
	
	//private int codigoUsuario;
	private String email;
	private String senha;
	private String nome;
	public Usuario(/*int codigoUsuario,*/ String email, String senha, String nome) {
		super();
		//this.codigoUsuario = codigoUsuario;
		this.email = email;
		this.senha = senha;
		this.nome = nome;
	}
	public Usuario() {
		super();
	}
	/*public int getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}*/
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
