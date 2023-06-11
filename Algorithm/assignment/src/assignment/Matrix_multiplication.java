package assignment;
import java.util.Scanner;

public class Matrix_multiplication {
	public Matrix_multiplication() {
		Scanner input = new Scanner(System.in);
				
		int firstArray[][] = {{1,3},{2,2}};
		int secondArray[][] = {{2,5,},{6,3}};
		int finalArray[][] = new int[firstArray.length][secondArray.length];
		for(int i = 0; i < firstArray.length-1; i++) {
			for(int j = 0; j < firstArray.length-1; j++) {
					for(int k = 0; k < firstArray.length-1; k++) {
						finalArray[i][j] = finalArray[i][j] + firstArray[i][k] * secondArray[k][j];
					}
						
			}
		}
		
		for(int u = 0; u < finalArray.length;  u++ ) {
			for(int f = 0; f < finalArray.length; f++) {
				System.out.print(finalArray[u][f]+ " ");
			}
			System.out.println();
		}
		

	}
}
