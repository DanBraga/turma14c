package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		/*
		 * Capturar:
		 * -Nome da disciplina
		 * -duas notas
		 * -calcular a media aritmetica
		 * -exibir a Media e o nome da disciplina
		 */

		String disciplina = JOptionPane.showInputDialog("Disciplina").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota1:"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota2:"));
		float media = (nota1 + nota2)/2;

		System.out.println("Disciplina..: " + disciplina);
		System.out.println("Nota1.: " + nota1);
		System.out.println("Nota2: " + nota2);
		if (media >= 6) {
			System.out.println("Parabens, voce est� aprovado!");

		} else if (media < 4 ) {
			System.out.println("Se ferrou, esta reprovado");
		} else  {
			System.out.println("exame seu safado");
		}



		System.out.println("Media: " + media + " na disciplina: " + disciplina);












	}

}
