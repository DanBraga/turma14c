package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
				
		String email = JOptionPane.showInputDialog("Digite o email").toLowerCase();
		while (email.contains("@")==false) {
			email =JOptionPane.showInputDialog("Informe email valido").toLowerCase();
		}
		
		System.out.println("usuario: " + email.substring(0, email.indexOf("@")));
		
		
		
		
		
		
		

	}

}
