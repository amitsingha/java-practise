public class Sudoku {

    public static boolean finder(int[][] board, int row, int col, int value){
        
        //Row & Column Check
        for (int i = 0; i < board.length; i++) {
                if (board[i][col] == value) {
                    return false;
            }
        }
        for (int i = 0; i < board.length; i++) {
                if (board[row][i] == value) {
                    return false;
            }
        }

        int grs = row/3 * 3;
        int gcs = col/3 * 3;

        for (int r = grs; r < grs+3; r++) {
            for (int c = gcs; c < gcs+3; c++) {
                if (board[r][c] == value) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean solver(int[][] board, int row, int col){

        if (row == board.length-1 && col == board.length) {
            System.out.println("Solved : ");
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j]+" ");
                }
                System.out.println("");
            }
            return true;
        }

        if (col == board.length) {
            row = row + 1;
            col = 0;
        } 
        
        if(board[row][col] == 0){
            for (int i = 1; i < board.length+1; i++) {
                if (finder(board , row, col, i)) {
                    //System.out.println("Find True.");
                    board[row][col] = i;
                    solver(board, row, col+1);
                    
                }
                board[row][col] = 0;
                
            }
        }
        else {
            //System.out.println("elRow : "+ row+ " elCol : "+col);
            solver(board, row, col+1);
        }
        
        return false;
    }

    public static void main(String[] args) {
        int board[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                         { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                         { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                         { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                         { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                         { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                         { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                         { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                         { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

        System.out.println("Before Solve : ");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println(" ");
        }
        solver(board, 0, 0);
    }
}
