package assignment;
import java.util.Scanner;
public class MAIN {
	public static void main(String args[]) {
		Scanner input = new  Scanner(System.in);
		System.out.println("First algorithm assignment\n");
		
		System.out.println("1. For Maximum element program");
		System.out.println("2. For Sequential search program");
		System.out.println("3. For Matrix multiplication program");
		System.out.println("4. For The Tower of Hanoi Puzzel program\n");
		
		int ans = input.nextInt();
		
		switch(ans) {
			case 1:
				Maximum_element sam = new Maximum_element();
				break;
			case 2:
				Sequential_search kase = new Sequential_search();
				break;
			case 3:
				Matrix_multiplication k = new Matrix_multiplication();
				break;
			case 4:
				int numDiscs = 3;
		        char first = 'A';
		        char second = 'B';
		        char third = 'C';
		        Hanoi han  = new Hanoi();
		        han.solveTowerOfHanoi(numDiscs, first, second, third);
			default:
				System.out.print("Program just ended");
				
		}


	}
}
