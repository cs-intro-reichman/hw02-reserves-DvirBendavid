/**
 * Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);
		String out = "";
		for(int i =0; i < n; i++){   
			
			if(i == (n-1))
				out += "*";
			
			else
				out += "* ";
			
		}
		int j = 0;
		while(j < n){
			
			if(j == 0 || j % 2 == 0)
				System.out.println(out + " ");
			else
				System.out.println(" " + out);
			
			j++;
		}

	}
}
