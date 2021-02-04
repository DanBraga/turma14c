package br.com.votacao.implementacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.votacao.beans.Candidato;
import br.com.votacao.beans.Eleitor;
import br.com.votacao.beans.Pessoa;
import br.com.votacao.beans.Urna;
import br.com.votacao.beans.Voto;
import br.com.votacao.util.Magica;

public class ImplementarUrna {

	public static void main(String[] args) {

		Pessoa candidato1 = new Candidato(
				"XPTO",
				5121,
				"VEREADOR",
				"PXDB"
				);
		
		Pessoa candidato2 = new Candidato(
				"ABC",
				4320,
				"VEREADOR",
				"PXC"
				);
		
		List<Voto> votos = new ArrayList<Voto>();
		
		do {
			Pessoa escolha = new Candidato();
			if (JOptionPane.showConfirmDialog
					(null, "Sim para Candidato 1?", "Votacao", JOptionPane.YES_NO_OPTION)==0) {
				escolha = candidato1;
			}else {
				escolha = candidato2;
			}
			
			Voto voto = new Voto(
					new Eleitor(
							Magica.s("Nome"),
							Magica.i("Titulo"),
							Magica.b("Ativo?")
							),
					escolha,
					Magica.b("Primeiro Turno?")
					);
			votos.add(voto);
		}while(JOptionPane.showConfirmDialog
				(null, "Continuar?", "Votacao", JOptionPane.YES_NO_OPTION)==0);
		
		
		Urna urna = new Urna(
				Magica.i("Zona"),
				Magica.i("Secao"),
				Magica.s("Cidade"),
				votos
				);
		
		//System.out.println(urna);
		
		System.out.println("Seção: " + urna.getSecao());
		System.out.println("Cidade: " + urna.getCidade());
		System.out.println("Total de Votos: " + urna.totalVotos());
		
		for (Voto voto : urna.getVotos()) {
			System.out.println("=========================================");
			System.out.println("Eleitor: " + voto.getEleitor().getNome());
			System.out.println("Candidato: " + voto.getCandidato().getNome());
		}
		
		
		
		
	}

}
