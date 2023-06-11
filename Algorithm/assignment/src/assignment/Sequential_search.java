package assignment;
import java.util.Scanner;
public class Sequential_search {
	
	public  Sequential_search() {
		
		Scanner input = new Scanner(System.in);
		// prompt about the program
		System.out.println("\nThis program find the value use input using sequential search alogrithm\n");
		
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
			
			for(int k = 0; k < userArray.length; k++) {
				if(input.hasNextInt()) {
					userArray[k] = input.nextInt();
				}else {
					System.out.print("Invalid input");
					break;
				}
			}
			
			System.out.print("Our new array: ");
			System.out.print("[");
			for(int m = 0; m < userArray.length; m++ ) {
				System.out.print(" " + userArray[m] + "  " );
			}
			System.out.print("]");
			
			System.out.println("\nEnter the number you want to search in the array");
			if(input.hasNextInt()) {
				int searchValue = input.nextInt();
				System.out.print("\nThe number you are searching:");
				
				int i = 0;
				while(i < userArray.length && userArray[i] != searchValue  ) {
					i += 1;
				}
				if( i < userArray.length) {
					System.out.print(" is at index  " + i);
				}else {
					System.out.print( "-1");
				}
			}else {
				System.out.print("Invalid input");
			}
			
			

			
		}else {
			System.out.println("\nEnter the number you want to search in the array");
			if(input.hasNextInt()) {
				int defValue = input.nextInt();
				System.out.print("\nThe number you are searching:");
				
				int k = 0;
				while(k < defArray.length && defArray[k] != defValue ) {
					k += 1;
				}
				if( k < defArray.length) {
					System.out.print(" is at index  " + k);
				}else {
					System.out.print( "-1");
				}
				
			}else {
				System.out.print("Invalid input");
			}
			


			}
	
			
	
		
	}


}
