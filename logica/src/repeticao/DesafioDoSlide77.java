package repeticao;

import javax.swing.JOptionPane;

public class DesafioDoSlide77 {

	public static void main(String[] args) {

		String escolaridade = "";
		int contmedio=0;
		int contsuperior=0;
		int contpos=0;
		do {
			escolaridade=JOptionPane.showInputDialog("digite sua escolaridade");
			if (escolaridade.equals("medio")) {
				contmedio = contmedio +1;
			} if (escolaridade.equals("superior")) {
				contsuperior=contsuperior+1;
			} if (escolaridade.equals("pos")){
				contpos=contpos+1;
			}					
		} while 
			 (escolaridade.equals("medio") || escolaridade.equals("superior") || (escolaridade.equals("pos")));
	
		if (contmedio>contsuperior && contmedio>contpos) {
			System.out.println("Maior valor � escolaridade media: " + contmedio);
		} 
		if (contsuperior>contmedio && contsuperior>contpos) {
			System.out.println("Maior valor � escolaridade superior: " + contsuperior);
		}
		if (contpos>contmedio && contpos>contsuperior) {
			System.out.println("Maior valor � escolaridade pos: " + contpos);
		}
	}
}



