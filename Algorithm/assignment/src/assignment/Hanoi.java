package assignment;

public class Hanoi {

	    public  void solveTowerOfHanoi(int numDiscs, char first, char second, char third) {
	        if (numDiscs == 1) {
	            System.out.println("Move disc 1 from " + first + " to " + third);
	            return;
	        }

	        solveTowerOfHanoi(numDiscs - 1, first, third, second);
	        System.out.println("Move disc " + numDiscs + " from " + first + " to " + third);
	        solveTowerOfHanoi(numDiscs - 1, second, first, third);
	    }
	}
