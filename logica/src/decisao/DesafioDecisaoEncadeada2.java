package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoEncadeada2 {

	public static void main(String[] args) {


		short diarias = Short.parseShort(JOptionPane.showInputDialog("quantidade de diarias:"));
		float taxa = 8;
		if (diarias>15) { 
			taxa = (float) 5.5;
		}
		else if (diarias ==15){
			taxa = (float) 6;
		}
		{
			System.out.println("valor a pagar" + ((taxa*diarias) + (80*diarias)) );
		}



	}
}		