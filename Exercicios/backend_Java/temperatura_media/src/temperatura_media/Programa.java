package temperatura_media;
import java.util.Scanner;

class Programa {

	public static void main(String[] args) {
		/* 
		 * Fa�a um programa que receba a temperatura m�dia de cada m�s do ano e
		armazene-as em um array. Mostre a maior e a menor temperatura do ano e em que m�s
		elas ocorreram (mostrar o m�s por extenso: 1 � janeiro, 2 � fevereiro, ...).
		Obs: Desconsiderar empates.
		*/
		Scanner temperature = new Scanner(System.in);
		Scanner month = new Scanner(System.in);
		int numberRead;
		String monthRead;
		
		System.out.println("Informe o m�s:");
		monthRead = month.next();
		
		
		System.out.println("Informe um n�mero m�dio de Temperatura:");
		numberRead = temperature.nextInt();
		
		
		System.out.println("O m�s informado �: " +monthRead);
		System.out.println("O n�mero �: " +numberRead);
		
	}

}
