import java.util.*;

public class arra {
    public static void main(String[] args){
        //int[] marks = new int[3];
        
        //marks[0] = 45;
        //marks[1] = 65;
        //marks[2] = 87;

        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int marks[] = new int[size];

        //Input
        for (int i = 0; i < marks.length; i++) {
            marks[i] = scanner.nextInt();
        }

        //int sc = scanner.nextInt();
        //Output
        for(int i=0; i < marks.length;i++){
            System.out.println(marks[i]);
        }

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] number = new int[rows][columns];
//Input
        for(int i=0;i<rows; i++){
            for (int j=0; j<columns;j++){
                number[i][j] = scanner.nextInt();

            }
        }
//Output
        for(int i=0;i<rows; i++){
            for (int j=0; j<columns;j++){
                System.out.println(number[i][j]);

            }
        }
    }
}
