package br.com.colecoes.implementacao;

import java.util.HashSet;
import java.util.Set;

public class TesteSetjava {

	public static void main(String[] args) {
		Set <String> lista=new HashSet<String>();
		lista.add("Suporte");
		lista.add("DBA");
		lista.add("Gestor");
		lista.add("Estag");
		lista.add("DBA");
		
		System.out.println(lista);
		
		for (String cargo: lista) {
			System.out.println("Cargo: " + cargo);
		}
	}

}
