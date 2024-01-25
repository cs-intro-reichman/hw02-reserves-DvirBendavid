/**
 * Prints a given string, backward. Then prints the middle character in the
 * string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main(String[] args) {

		// get the string, keep the length and middle character
		String givenS = args[0];
		int length = (givenS.length() - 1);
		char midC = givenS.charAt(length / 2);
		String reversed = "";

		// insert the given string backwards into the new reversed string
		while (length >= 0) {
			reversed += givenS.charAt(length);
			length--;
		}

		System.out.println(reversed);
		System.out.println("the middle character is " + midC);
	}
}
