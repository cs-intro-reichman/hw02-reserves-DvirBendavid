/**
 * Generates and prints random integers in the range [0,10),
 * as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main(String[] args) {

		// create 2 rand integers int the range and print the first
		int rand1 = (int) (Math.random() * 10);
		int rand2 = (int) (Math.random() * 10);
		System.out.print(rand1);

		// check if the next generated number is bigger than the last one and keep
		// generating if so
		while (rand2 >= rand1) {
			System.out.print(" " + rand2);
			rand1 = rand2;
			rand2 = (int) (Math.random() * 10);
		}

	}
}
