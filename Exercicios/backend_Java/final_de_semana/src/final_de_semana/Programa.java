package final_de_semana;

class Programa {

	public static void main(String[] args) {
		
		String diaDaSemana = "Domingo";
		//String diaDaSemana = "Domingo";
		
		switch (diaDaSemana) {
		case "Sab�do":
			System.out.println("Hoje � " + diaDaSemana + ". Vamos curtir !! Bom Final de Semana !!");
		break;
		case "Domingo":
			System.out.println("Hoje � " + diaDaSemana + ". Vamos curtir !! Bom Final de Semana !!");
		break;
		default:
			System.out.println("Hoje � " + diaDaSemana + ". Vamos trabalhar !!");
		}
	}

}
