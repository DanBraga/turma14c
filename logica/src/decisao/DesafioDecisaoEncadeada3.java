package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoEncadeada3 {

	public static void main(String[] args) {
		
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Valor 3"));
		
		if (valor1!=valor2 && valor2!=valor3 && valor3!=valor1) {
			if (valor1>valor2 && valor1>valor3) {
				
			} else if (valor2>valor3 && valor2>valor1) {
				
			} else {
				
			}
					
		}else {
			System.out.println("Existem valores iguais");
		}
		
			


		


	}
}		