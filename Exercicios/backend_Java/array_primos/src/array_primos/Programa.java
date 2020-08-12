package array_primos;

class Programa {

	public static void main(String[] args) {

		int[] numbers = { 3, 15, 35, 11, 12, 35, 7, 85, 25 };
		int countDividers = 0;

		for (int length = 0; length < numbers.length; length++) {

			for (int counter = 1; counter <= numbers[length]; counter++) {
				if (numbers[length] % counter == 0) {
					countDividers++;
				}
			}

			if (countDividers == 2) {
				System.out.println("Indice: " + (length) + " N�mero: " + numbers[length]);
			} else {
				System.out.println("O numero n�o � primo.");
			}

			countDividers = 0;
		}
	}

}
