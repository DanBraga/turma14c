package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		/*jogador 1 digita numero
		 * jogador 2 vai ter q descobrir o numero
		 * quando jogador 2 acertar, exibir mensagem parabens
		 * 
		 * implementar dicas - o nunmero � menor/o numero � maior
		 * 
		 * quando o jogador 2 acertar, exibir quantas tentativas ele usou
		 */
	
		int num1 = 0;
		int num2 = 0;
		int tentativas = 0;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("numero 1"));
		do {			
			num2 = Integer.parseInt(JOptionPane.showInputDialog("numero 2"));
			if (num1>num2) {
				System.out.println("numero a acertar � maior");
			} if (num2>num1) {
				System.out.println("numero a acertar � menor");
			}
			tentativas = tentativas + 1;			
		}while (num1!=num2);
		
		
		JOptionPane.showMessageDialog(null, "acertou!, numero de tentativas: " + tentativas);
			
				
	}

}
