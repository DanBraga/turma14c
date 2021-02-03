package br.com.heranca.implementacao;

import br.com.heranca.beans.Bacharelado;
import br.com.heranca.beans.Formacao;
import br.com.heranca.beans.Medio;
import br.com.heranca.util.Magica;

public class TesteFormacao {

	public static void main(String[] args) {
	 int opcao = Magica.i("1 - Medio\n2 - Bacharelado\n3 - Medio");
		Formacao formacao = new Formacao();
		
		if (opcao==1) {
			formacao = new Medio(Magica.s("Descricao"),Magica.i("Periodo: 1 Manha 2 Noite"),0,0,Magica.s("Tipo"));
					
		}
		
		if (opcao==2) {
			formacao = new Bacharelado(Magica.s("Descricao"),Magica.i("Periodo: 1 Manha 2 Noite"),0,0,true); 

	}

		
		formacao.definirDuracao();
		System.out.println(formacao.toString());
		
		
	}	
}
