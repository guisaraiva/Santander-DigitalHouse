package array_ordenado;
import java.util.Arrays;

class Programa {

	public static void main(String[] args) {
		int[] numbers = { 3, 15, 35, 11, 12, 35, 7, 85 };
		
		Arrays.sort(numbers);
		printNumbersAsc(numbers);
	}

	public static void printNumbersAsc(int[] numbers) {
		for (int number: numbers) {
			System.out.println(number);
		}
	}
}
