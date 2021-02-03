package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.colecoes.beans.Cargo;

public class TesteListaObjeto {

	public static void main(String[] args) {

		List<Cargo> lista = new ArrayList<Cargo>();
		lista.add(new Cargo("Suporte", "JR", 5000));
		lista.add(new Cargo("DBA", "SR", 4000));
		lista.add(new Cargo("Estag", "JR", 1000));
	
	float total = 0;
	
				
		for (Cargo objeto : lista) {
			total+=objeto.getSalario();
			if (objeto.getSalario()>=5000) {
				System.out.println("Cargo..." +objeto.getNome());
			}
			
			}
			
							
		System.out.println("Total de salarios:  " + total);
		
		Collections.sort(lista);
		System.out.println("Lista Ordenada: " + lista);

						
		}
		
	
		
	}


