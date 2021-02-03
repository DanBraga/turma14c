package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = JOptionPane.showInputDialog("nome");
		int mes = Integer.parseInt(JOptionPane.showInputDialog("informe o mês"));
			while (mes > 12) {
			mes = Integer.parseInt(JOptionPane.showInputDialog("informe mês valido"));							
			}
		int dia = Integer.parseInt(JOptionPane.showInputDialog("informe o dia"));
			while (dia > 31 || mes==2 && dia>29 || mes==10 && dia>30)  {
			dia = Integer.parseInt(JOptionPane.showInputDialog("informe dia valido"));	
			}
		int ano = Integer.parseInt(JOptionPane.showInputDialog("informe o ano"));
			while (ano>2003) {		
			ano = Integer.parseInt(JOptionPane.showInputDialog("informe ano valido"));
			}
			
		while (nome.length()<=5 || nome.length()>=20) {
			nome = JOptionPane.showInputDialog("informe nome valido");
		}
			System.out.println("data: " +dia +"/"+ mes + "/" + ano);
				

	}
			
	}
