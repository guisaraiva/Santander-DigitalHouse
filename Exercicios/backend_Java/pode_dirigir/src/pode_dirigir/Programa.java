package pode_dirigir;

class Programa {

	public static void main(String[] args) {
		int idade = 55;
		boolean cnh = true;
		
		if(idade >= 18 && cnh == true) {
			System.out.println("Pode dirigir!! Você está habilitado.");
		}else if (idade >= 18 && cnh ==false) {
			System.out.println("Não pode dirigir!!. Você não tem CNH.");
		}
		else {
			System.out.println("Não pode dirigir!!. Você é menor de idade.");
		}
	}

}
