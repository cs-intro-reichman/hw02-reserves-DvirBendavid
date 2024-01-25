/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		
		int t = Integer.parseInt(args[0]);
		int child2 = 0;
		int child3 = 0;
		int child4 = 0;
		double average =0;
		
		for(int i =0; i < t; i++){
			
			boolean boy = false;
			boolean girl = false;
			int count = 0;

			while (!boy || !girl) {

				double rand = Math.random();

				if (rand >= 0.5) {
				boy = true;
				
				}

				else {
				girl = true;
				
				}

				count++;
				
				
				
			}
				average+= count;
				
				if(count == 2)
					child2 += 1;
				
				if(count == 3)
					child3 += 1;
				
				if(count >= 4)
					child4 += 1;
				
				
		}
		
		
		average = (average/t);
		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + child2);
		System.out.println("Number of families with 3 children: " + child3);
		System.out.println("Number of families with 4 or more children: " + child4);
		
		if(child4 >= child2 && child4 >= child3)
			System.out.println("The most common number of children is 4 or more.");
		if(child2 >= child4 && child2 >= child3)
			System.out.println("The most common number of children is 2");
		if(child3 >= child4 && child3 >= child2)
			System.out.println("The most common number of children is 3");
		
		
	}
}
