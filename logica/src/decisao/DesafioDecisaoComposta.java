package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoComposta {

	public static void main(String[] args) {
		/*
		 * Capturar:
		 * -Nome do produto
		 * -qtde estoque
		 * -valor da venda
		 * -exibir:estoque medio- qtde entre 10 e 20
		 * -exibir:estoque alto- qtde maior q 20
		 * -exibir:estoque baixo- qtde entre 5 e 9
		 * -exibir:estoque emergencial- qtde menor q 5
		 * o valor total do estoque
		 * o valor da venda com 10% de desconto
		 */

		String produto = JOptionPane.showInputDialog("Produto").toUpperCase();
		short quantidade = Short.parseShort(JOptionPane.showInputDialog("Quantidade:"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor do produto:"));
		float desconto = (valor + valor)/ (float)20;
				
		if (quantidade <5) {
			System.out.println("produto..: " + produto + " com estoque emergencial:" + quantidade);

		} else if (quantidade >= 5 && quantidade <= 9 ) {
			System.out.println("produto..: " + produto + " com estoque baixo:" + quantidade);
		} else  {
			System.out.println("produto..: " + produto + " com estoque alto" + quantidade);
		}
		
		System.out.println("Valor: " + valor + " desconto: " + desconto);
			












	}

}
