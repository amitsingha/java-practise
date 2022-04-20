import java.util.*;

public class solveNQueen {

    public static boolean isValid(int row, int col,char[][] board){

        //Column Check
        //System.out.println("Row1 = "+ row);
        //System.out.println("Col1 = "+ col);
        int r = row;
        for (int c=0;c<board.length;c++){

            if (board[r][c] == 'Q') {
                return false;
            }
        }

        //Row Check
        int c = col;
        //System.out.println("Row2 = "+ r);
        //System.out.println("Col2 = "+ c);
        for (r=0;r<board.length;r++){

            if (board[r][c] == 'Q') {
                return false;
            }
        }

        //Upper Left
        r=row;
        //System.out.println("Row3 = "+ r);
        //System.out.println("Col3 = "+ c);
        for (c=col; 0<=c && r>=0; c--, r--){

            if (board[r][c] == 'Q') {
                return false;
            }
        }

        //Upper Right
        //System.out.println("col "+col);
        r=row;
        //System.out.println("Row4 = "+ r);
        //System.out.println("Col4 = "+ c);
        for (c=col; c<board.length && r>=0; c++, r--){

            if (board[r][c] == 'Q') {
                return false;
            }
        }

        //Lower Left
        r=row;
        //System.out.println("Row5 = "+ r);
        //System.out.println("Col5 = "+ c);
        for (c=col; c >= 0 && r<board.length; c--, r++){

            if (board[r][c] == 'Q') {
                return false;
            }
        }

        //Lower Right
        r=row;
        //System.out.println("Row6 = "+ r);
        //System.out.println("Col6 = "+ c);
        for (c=col; c<board.length && r<board.length; c++, r++){

            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void saveBoards(char[][] board, List<List<String>> allBoards){
        
        String row;
        List<String> newBoard = new ArrayList<String>();

        for (int i= 0; i<board.length;i++){
            row="";
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 'Q'){
                    row += 'Q';
                }else{
                    row += '-';
                }
            }
            newBoard.add(row);
            
        }
        allBoards.add(newBoard);
        System.out.println(newBoard);
    }

    public static void helper(char[][] board, List<List<String>> allBoards, int col){
        if (col == board.length) {
            saveBoards(board, allBoards);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            //System.out.println(board.length);
            if(isValid(row, col, board)){
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col] = '-';
            }
        }
    }

    public static void nQueens(int n){

        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board, allBoards, 0);

    }

    public static void main(String[] args) {
        
        nQueens(4);
    }
}
