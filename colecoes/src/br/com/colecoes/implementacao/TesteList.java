package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {
	
	//	int numeros[] = new int[5];
		
		List<String> lista = new ArrayList<String>();
		lista.add("Suporte");
		lista.add("DBA");
		lista.add("Gestor");
		lista.add("Estag");
	//	lista.add(true);
	//	lista.add(15);
	//	lista.add(15.5);
		
		
		System.out.println("original: " + lista);
		System.out.println("Segundo elemento " + lista.get(0));
		lista.remove(0);
		System.out.println("Segundo elemento " + lista.get(0));
		Collections.sort(lista);
		System.out.println("ordenada: " + lista);
		
		int contadorDBA =0;
		for (int indice=0;indice<lista.size();indice++) {
			System.out.println("Cargo: " + lista.get(indice));
			if (lista.get(indice).equals("DBA")) {
				contadorDBA++;
			}
		}
		System.out.println("contador de DBA: " + contadorDBA);
		

	}

}
