package pode_dirigir;

class Programa {

	public static void main(String[] args) {
		int idade = 55;
		boolean cnh = true;
		
		if(idade >= 18 && cnh == true) {
			System.out.println("Pode dirigir!! Voc� est� habilitado.");
		}else if (idade >= 18 && cnh ==false) {
			System.out.println("N�o pode dirigir!!. Voc� n�o tem CNH.");
		}
		else {
			System.out.println("N�o pode dirigir!!. Voc� � menor de idade.");
		}
	}

}
