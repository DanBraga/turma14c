package br.com.heranca.beans;

import br.com.heranca.util.PadraoFormacao;

public class Medio extends Formacao implements PadraoFormacao{

	
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	public Medio() {
		super();
	}

		
	public Medio(String descricao, int periodo, int duracao, double mensalidade, String tipo) {
		super(descricao, periodo, duracao, mensalidade);
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Medio [tipo=" + tipo + "]" + ", " + super.toString() +"";
	}

	public void setAll(String descricao, int periodo, int duracao, double mensalidade, String tipo) {
		super.setAll(descricao, periodo, duracao, mensalidade);
		this.tipo = tipo;
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
