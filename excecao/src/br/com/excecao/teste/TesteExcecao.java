package br.com.excecao.teste;

public class TesteExcecao {

	public static void main(String[] args) {

		try {
			
			int numero = Integer.parseInt("1");
			System.out.println("Numero: "  + numero);
			
			String palavra = "";
			System.out.println("qtde Letras: " + palavra.length());
			
			int numeros[] = new int[3];
			numeros[0]= 500;
			numeros[1] = 15;
			numeros[2] = 17;
						
		}catch (NullPointerException e) {
			
			System.out.println("Existe dado nulo");
						
		}catch (NumberFormatException e) {
			
			System.out.println("Numero invalido");
						
		}
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Vetor estourou");
						
		}
		catch (Exception e) {
			
			System.out.println("Deu ruim");
			e.printStackTrace();
			
		}finally {
			System.out.println("tenha um bom dia");
		}
		
			

	}

}
