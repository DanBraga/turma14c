package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoEncadeada {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Nome da cidade").toUpperCase();
		int populacao = Integer.parseInt(JOptionPane.showInputDialog("Populacao:"));
		float idh = Float.parseFloat(JOptionPane.showInputDialog("IDH:"));
		if (populacao<200000) {
			if (idh > 0.85) {
				System.out.println(nome + " � uma Boa cidade");
			}
				else
				 { System.out.println(nome +" � uma cidade que precisa de cuidados");
				}	
			}
		 else {
				if (idh > 0.9) {
					System.out.println(nome + " � uma cidade perfeita");
				}
					if (idh > 0.75 && idh <0.9)
					 { System.out.println(nome +" � uma boa cidade");
					 }
					 else {
						 System.out.println(nome +" � uma cidade que precisa de cuidados");
					}	
				}


		}

	}


