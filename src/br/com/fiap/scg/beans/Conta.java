package br.com.fiap.scg.beans;

public class Conta {
	
	//private int codigoConta;
	private Usuario usuario;
	private double valorConta;
	private double salarioAtual;
	private double salarioTotal;
	private double gastoTotal;
	private double lucro;
	private double meta;
	public Conta(/*int codigoConta,*/ Usuario usuario, double valorConta, double salarioAtual, double salarioTotal, double gastoTotal,
			double lucro, double meta) {
		super();
		//this.codigoConta = codigoConta;
		this.usuario = usuario;
		this.valorConta = valorConta;
		this.salarioAtual = salarioAtual;
		this.salarioTotal = salarioTotal;
		this.gastoTotal = gastoTotal;
		this.lucro = lucro;
		this.meta = meta;
	}
	public Conta() {
		super();
	}
	/*public int getCodigoConta() {
		return codigoConta;
	}
	public void setCodigoConta(int codigoConta) {
		this.codigoConta = codigoConta;
	}*/
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public double getValorConta() {
		return valorConta;
	}
	public void setValorConta(double valorConta) {
		this.valorConta = valorConta;
	}
	public double getSalarioAtual() {
		return salarioAtual;
	}
	public void setSalarioAtual(double salarioAtual) {
		this.salarioAtual = salarioAtual;
	}
	public double getSalarioTotal() {
		return salarioTotal;
	}
	public void setSalarioTotal(double salarioTotal) {
		this.salarioTotal = salarioTotal;
	}
	public double getGastoTotal() {
		return gastoTotal;
	}
	public void setGastoTotal(double gastoTotal) {
		this.gastoTotal = gastoTotal;
	}
	public double getLucro() {
		return lucro;
	}
	public void setLucro(double lucro) {
		this.lucro = lucro;
	}
	public double getMeta() {
		return meta;
	}
	public void setMeta(double meta) {
		this.meta = meta;
	}
	

}
