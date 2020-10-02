package SamplePrograms;

public class Array2DEx1 {

    public static void main(String[] args) {
        //2D array of 4 rows x 5 columns = 20 locations
        int x[][] = new int[4][5];
        
        //x[3][2] = 50;
        
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                int num = 10 * row + col;
                x[row][col] = num;
                System.out.format("%3d |", x[row][col]);
            }
            System.out.println("");//new line at end of row
            
        }
        
        //make and initialize a 2D array
        System.out.println("\n-------------------\n");
        int marks[][] = { 
            {67,78,67,55,76,82,91},
            {88,65,77,99,55},
            {34,35,45,54},
            {88,66,44,55,67,86}
        };
        //print marks
        //marks.length - number of rows
        //marks[row].length - number of columns for each row
        for (int row = 0; row < marks.length; row++) {
            for (int col = 0; col < marks[row].length; col++) {
                System.out.format("%3d |", marks[row][col]);
            }
            System.out.println("");//new line at end of row
        
        
        }
       
    }
    
}
