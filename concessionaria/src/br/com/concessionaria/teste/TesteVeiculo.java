package br.com.concessionaria.teste;

import javax.swing.JOptionPane;

import br.com.concessionaria.modelo.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {

		//instanciando um objeto
		Veiculo objeto = new Veiculo();
		objeto.preencherModelo(JOptionPane.showInputDialog("Digite o modelo"));
		System.out.println(objeto.retonarModelo());
		
		objeto.preencherPlaca(JOptionPane.showInputDialog("Digite a placa"));
		System.out.println(objeto.retornaPlaca());
		
		objeto.preencherValor(100);
		System.out.println(objeto.retornaValor());
		
		objeto.retornarDesconto();
		System.out.println(objeto.retornarDesconto());
		
		objeto.aplicarReajuste(10);
		System.out.println(objeto.retornaValor());
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		

	}

}
