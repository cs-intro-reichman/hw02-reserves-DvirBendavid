/**
 * Gets a command-line argument (int), and chekcs if the given number is
 * perfect.
 */
public class Perfect {
	public static void main(String[] args) {

		int num = Integer.parseInt(args[0]);
		String outS = num + " is a perfect number since " + num + " = 1";
		int sum = 1;

		// checks if the number is a divisor and add it to the sum and string
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				sum += i;
				outS += " + " + i;
			}
		}

		// checks if the number is perfect
		if (num == sum) {
			System.out.println(outS);
		}

		else {
			System.out.println(num + " is not a perfect number");
		}

	}
}
