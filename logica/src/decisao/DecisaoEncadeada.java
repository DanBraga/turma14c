package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {
		/*
		 * Capturar:
		 * -qatde de faltas 
		 * -aprovacao sera com base na media e a quantidade de faltas tem q ser menor que 20
		 */
		String disciplina = JOptionPane.showInputDialog("Disciplina").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Faltas:"));
		if (faltas>=20) {
			System.out.println("reprovado por faltas");
		} else {
			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota1:"));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota2:"));
			float media = (nota1 + nota2)/2;

			System.out.println("Disciplina..: " + disciplina);
			System.out.println("Nota1.: " + nota1);
			System.out.println("Nota2: " + nota2);
			if (media >= 6 ){
			System.out.println("Parabens, voce está aprovado!");

			} else if (media < 4 || faltas>=20 ) {
			System.out.println("Se ferrou, esta reprovado");
			} else  {
			System.out.println("exame seu safado");
		}
		


		System.out.println("Media: " + media + " na disciplina: " + disciplina);










		}

	}

}
