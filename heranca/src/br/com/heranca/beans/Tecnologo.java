package br.com.heranca.beans;

import br.com.heranca.util.PadraoFormacao;

public class Tecnologo extends Formacao implements PadraoFormacao {

	
	
	public String projetoConclusao;
	public int cargaHorariaEstagio;
	
	public String getProjetoConclusao() {
		return projetoConclusao;
	}
	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}
	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}
	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	
	@Override
	public String toString() {
		return "Tecnologo [projetoConclusao=" + projetoConclusao + ", cargaHorariaEstagio=" + cargaHorariaEstagio + ", " + super.toString() +"]";
	}
	public Tecnologo(String descricao, int periodo, int duracao, double mensalidade, String projetoConclusao,
			int cargaHorariaEstagio) {
		super(descricao, periodo, duracao, mensalidade);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	public void setALL(String descricao, int periodo, int duracao, double mensalidade, String projetoConclusao,
			int cargaHorariaEstagio) {
		super.setAll(descricao, periodo, duracao, mensalidade);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
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



