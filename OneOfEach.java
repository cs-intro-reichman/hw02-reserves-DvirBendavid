
/**
 * Simulates the formation of a family in which the parents decide
 * to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main(String[] args) {

		boolean boy = false;
		boolean girl = false;
		int count = 0;

		while (!boy || !girl) {

			double rand = Math.random();

			if (rand >= 0.5) {
				boy = true;
				System.out.print("b ");
			}

			else {
				girl = true;
				System.out.print("g ");
			}

			count++;

		}
		System.out.println();
		System.out.println("You made it... and now you have " + count + " children.");
	}
}
