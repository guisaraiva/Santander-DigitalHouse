package temperatura_media;
import java.util.Scanner;

class Programa {

	public static void main(String[] args) {
		/* 
		 * Faça um programa que receba a temperatura média de cada mês do ano e
		armazene-as em um array. Mostre a maior e a menor temperatura do ano e em que mês
		elas ocorreram (mostrar o mês por extenso: 1 – janeiro, 2 – fevereiro, ...).
		Obs: Desconsiderar empates.
		*/
		Scanner temperature = new Scanner(System.in);
		Scanner month = new Scanner(System.in);
		int numberRead;
		String monthRead;
		
		System.out.println("Informe o mês:");
		monthRead = month.next();
		
		
		System.out.println("Informe um número médio de Temperatura:");
		numberRead = temperature.nextInt();
		
		
		System.out.println("O mês informado é: " +monthRead);
		System.out.println("O número é: " +numberRead);
		
	}

}
