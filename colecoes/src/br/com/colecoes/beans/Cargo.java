package br.com.colecoes.beans;

public class Cargo implements Comparable<Cargo>{
	private String Nome;
	private String nivel;
	private float salario;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Cargo [Nome=" + Nome + ", nivel=" + nivel + ", salario=" + salario + "]";
	}
	public Cargo(String nome, String nivel, float salario) {
		super();
		Nome = nome;
		this.nivel = nivel;
		this.salario = salario;
	}
	
	/*
	@Override
	public int compareTo(Cargo outro) {
		if (this.salario>outro.salario) {
			return 1;
		}else if (this.salario<outro.salario) {
			return -1;
		}else {
			return 0;
		}
				
	}
	*/
	
	@Override
	public int compareTo(Cargo outro) {
		return this.Nome.compareTo(outro.Nome);
				
	}
	
}
