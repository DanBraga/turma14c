package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {
		
		char resposta = 0;
		do {
			int num1 = Integer.parseInt(JOptionPane.showInputDialog("numero 1"));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("numero 2"));
			System.out.println("Resultado: " + (num1+num2));
			resposta = JOptionPane.showInputDialog("Digite S para continuar").charAt(0);
		}while (resposta=='S');
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
