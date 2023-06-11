package assignment;
import java.util.Scanner;
import java.lang.String;
import java.lang.Integer;

public class Maximum_element {
	Scanner input = new Scanner(System.in);


		// constructor
		public Maximum_element(){

			// prompt about the program
			System.out.println("\nThis program find the maximum element of a given array\n");
			
			// static array created
			int defArray[] = {23,53,74,90,43,99,45,22};
			
			// dynamic array
			
			System.out.print("The program was a default array of: ");
			int lastEnd = defArray.length;
			
			System.out.print("[");
			for(int s = 0; s < lastEnd-1; s++ ) {
				System.out.print(" " + defArray[s] + "  " );
			}
			System.out.print("]");
			


			System.out.print("\n\nEneter 'Y' to input new array\n");
			String ans;
			ans = input.nextLine();
			String fin = ans.toLowerCase();
			
			if(fin.equals("y")) {
				
				int userArray[] = new int[8];
				System.out.print("\nEnter new array");
				
				for(int k = 0; k < userArray.length-1; k++) {
					if(input.hasNextInt()) {
						userArray[k] = input.nextInt();
					}else {
						System.out.print("Invalid input");
						break;
					}
				}
				
				System.out.print("Our new array: ");
				System.out.print("[");
				for(int m = 0; m < userArray.length-1; m++ ) {
					System.out.print(" " + userArray[m] + "  " );
				}
				System.out.print("]");
				
				System.out.print("\nThe maximum element is : ");
				
				int maxval = userArray[0];
				for(int i = 1; i < userArray.length-1; i++) {
					if(userArray[i] > maxval) {
						maxval = userArray[i];
					}
				}
				System.out.print(maxval);
				
			}else {
				System.out.print("Continue with the default array");
				int maxval = defArray[0];
				System.out.print("\nThe maximum element is : ");
					for(int i = 1; i < defArray.length-1; i++) {
					if(defArray[i] > maxval) {
						maxval = defArray[i];
					}
				}
				System.out.print(maxval);
				
			}
			
			
			
			
		}
		
}
