package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		//capturar nome e idade, e exibir se pessoa � obrigada a votar, se nao pode ou se voto e facultativo
		
		String nome = JOptionPane.showInputDialog("Nome:");
		float idade = Float.parseFloat(JOptionPane.showInputDialog("idade:"));
		
		if (idade > 18 && idade <70)  {
			System.out.println(nome + " � obrigado a votar");	
		}
		if (idade < 16) {
			System.out.println(nome + " N�o pode votar");	
		}
		if (idade == 16 || idade ==17 || idade >70)  {
			System.out.println(nome + " voto facultativo");
		}

		
		
	
		
		
		
		
		
		
		

	}

}
