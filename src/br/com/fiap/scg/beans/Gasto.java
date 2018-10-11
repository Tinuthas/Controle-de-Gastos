package br.com.fiap.scg.beans;

public class Gasto {
	
	//private int codigoGasto;
	private Conta conta;
	private double valorGasto;
	private String descricao;
	private String data;
	public Gasto(/*int codigoGasto,*/ Conta conta, double valorGasto, String descricao, String data) {
		super();
		//this.codigoGasto = codigoGasto;
		this.conta = conta;
		this.valorGasto = valorGasto;
		this.descricao = descricao;
		this.data = data;
	}
	public Gasto() {
		super();
	}
	/*public int getCodigoGasto() {
		return codigoGasto;
	}
	public void setCodigoGasto(int codigoGasto) {
		this.codigoGasto = codigoGasto;
	}*/
	
	
	
	public double getValorGasto() {
		return valorGasto;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	public void setValorGasto(double valorGasto) {
		this.valorGasto = valorGasto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
	
	
}
