
package fundamental;


public class WorkingWithArray {
    public static void main(String[] args) {
        //single dimensional array
        
        //Declaring an array
        /*
        int[] marks;
        marks = new int[5];
        
        
        int[] time = new int[5];
        */
        
        //initializing an array
        int[] marks = new int[] {10,20,30,40,50};
        
        //declare and assign
        int[] time = new int[5];
        time[0] = 4;
        time[1] = 5;
        time[2] = 2;
        time[3] = 9;
        time[4] = 19;
        
        //outputting the element of an array
        
        //using for loop
        for (int i = 0; i < time.length; i++) {
            System.out.println(i);
        }
        
        //using foreach loop
        for( int i : marks)
            System.out.println(i);
        
        
        //using index of the array
        System.out.println(marks[0]);
        System.out.println(marks[3]);
        
        
        //multi dimensional array
        
        //declaring an array
        
        int[][] studentMarks = {
            {43,23,22,55,66},
            {45,23,55,33,22},
            {64,63,2,55,12}
        };
        
        for (int i = 0; i < studentMarks.length; i++) {
            for (int j = 0; j < studentMarks[0].length; j++) {
                System.out.print(studentMarks[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
