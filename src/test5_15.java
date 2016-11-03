import java.util.Scanner;

public class test5_15 {
	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		final int NUMBER_OF_PRIMES = 50;
		final int NUMBER_OF_PRIMES_PER_LINE = 10;

		int start = 2;
		int count = 0;

		while (count < NUMBER_OF_PRIMES) {
			boolean prime = true;
			for (int divisor = 2; divisor <= start / 2; divisor++) {
				if (start % divisor == 0) {
				
					prime = false;
					break;
				}
			}
			if (prime) {
				count++;

				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					System.out.println(start);
				} else {
					System.out.print(start + " ");
				}
			}
			start++;
		}

	}

}
