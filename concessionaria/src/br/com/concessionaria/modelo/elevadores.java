package br.com.concessionaria.modelo;

public class elevadores {
	
	private byte andarmaximo;
	private byte andarminimo;
	private byte capacidadePessoas=10;
	private byte qtdePessoas =0;
	private byte andarAtual;
	private String nome;
	
	public byte entrar() {
		qtdePessoas++;
		return qtdePessoas;
		}
	
	public byte sair() {
		return qtdePessoas--;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

