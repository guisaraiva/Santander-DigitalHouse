package aula_java;

public class Programa {

	public static void main(String[] args) {
		
		
		int idade = 20;
		String country = "Brasil";
		
		if( idade < 18) {
			System.out.println("Usu�rio n�o pode beber !");
		}else if (idade < 21 && country == "EUA") {
			System.out.println("Usu�rio n�o pode beber !");
			
		}else {
			System.out.println("Usu�rio pode beber !");
		}
		
		switch (country) {
		case "Brasil":
			System.out.println("Usu�rio � Brasileiro !");
			break;
			
		case "EUA":
			System.out.println("Usu�rio � Norte Americano !");
			break;
		default:
			System.out.println("Usu�rio com nacionalidade n�o identificada.");
		}

	}

}
