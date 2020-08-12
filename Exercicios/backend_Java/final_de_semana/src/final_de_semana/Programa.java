package final_de_semana;

class Programa {

	public static void main(String[] args) {
		
		String diaDaSemana = "Domingo";
		//String diaDaSemana = "Domingo";
		
		switch (diaDaSemana) {
		case "Sabádo":
			System.out.println("Hoje é " + diaDaSemana + ". Vamos curtir !! Bom Final de Semana !!");
		break;
		case "Domingo":
			System.out.println("Hoje é " + diaDaSemana + ". Vamos curtir !! Bom Final de Semana !!");
		break;
		default:
			System.out.println("Hoje é " + diaDaSemana + ". Vamos trabalhar !!");
		}
	}

}
