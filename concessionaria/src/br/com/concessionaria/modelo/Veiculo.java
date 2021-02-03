package br.com.concessionaria.modelo;

public class Veiculo {
	
	private String modelo;
	private String placa;
	private float valor;
	private boolean status;
	private float velocidadeAtual;
	
	public String retornarResumo() {
		String placa = "nova";
		if (status==false) {
			placa="DESLIGADO";
		}
		return "Modelo: " + modelo +  "\nStatus: " + placa;
	}
	
	
	public String aplicarReajuste(float porcentagem) {
		
		valor = valor + valor * (porcentagem/100);
		return "valor atualizado";
	}
	
	// <modificador> <tipo do retorno> <nome do metodo> (<tipo do parametro> <nome do parametro>
	public void preencherModelo(String param) {
		modelo = param.toUpperCase();
	}
	
	public String retonarModelo() {
		return modelo;
	}
	
	public void preencherPlaca(String param) {
		placa = param;
	}
	
	public String retornaPlaca() {
		return placa;
	}
	
	public void preencherValor(float param) {
		valor = param;
	}
	
	public float retornaValor() {
		return valor;
	}
	
	public void preencherStatus(boolean param) {
		
	}
	
	public boolean retornaStatus() {
		return status;
	}
	
	public void preenchervelocidadeAtual(float param) {
		
	}
	
	public float retornavelocidadeAtual() {
		return velocidadeAtual;
	}
	
	public float retornarDesconto() {
		return valor * (float) 0.95;
		
	}
	

	
	
	
	

}