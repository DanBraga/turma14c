package br.com.heranca.beans;

import br.com.heranca.util.PadraoFormacao;

public class Bacharelado extends Formacao implements PadraoFormacao{
	
	private boolean planoEstendido;
	
	

	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}

	@Override
	public String toString() {
		return "Bacharelado [planoEstendido=" + planoEstendido + ", " + super.toString() +"]";
	}

	public Bacharelado(String descricao, int periodo, int duracao, double mensalidade, boolean planoEstendido) {
		super(descricao, periodo, duracao, mensalidade);
		this.planoEstendido = planoEstendido;
	}

	public void setAll(String descricao, int periodo, int duracao, double mensalidade, boolean planoEstendido) {
		super.setAll(descricao, periodo, duracao, mensalidade);
		this.planoEstendido = planoEstendido;
	}

	@Override
	public String calcularDesconto(float porc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void calcularMensalidade(double fator) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
