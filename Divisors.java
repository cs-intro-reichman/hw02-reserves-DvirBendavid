/**
 * Gets a command-line argument (int), and prints all the divisors of the given
 * number.
 */
public class Divisors {
	public static void main(String[] args) {

		int num = Integer.parseInt(args[0]);

		// goes through the integers between 1 and the given number and checks for
		// divisors.
		for (int i = 1; i <= num; i++) {

			if (num % i == 0)
				System.out.println(i);
		}
	}
}
