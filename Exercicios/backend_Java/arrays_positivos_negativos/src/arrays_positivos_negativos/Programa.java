package arrays_positivos_negativos;

class Programa {

	public static void main(String[] args) {

		int[] numbers = { 3, -15, 35, -11, 12, 35, 7, -85 };
		int[] numbersPositives, numberNegatives;
		numbersPositives = new int[8];
		numberNegatives = new int[8];

		for (int count = 0; count < numbers.length; count++) {
			if (numbers[count] > 0) {
				numbersPositives[count] = numbers[count];
				System.out.println("Positivo: indice-> " + count + " N�: " + numbersPositives[count]);
			} else {
				numberNegatives[count] = numbers[count];
				System.out.println("Negativo: indice-> " + count + " N�: " + numberNegatives[count]);
			}
		}
	}
}
