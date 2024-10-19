public class NqueensTotalNoOfWays{

    public static int count = 0;

    public static boolean isSafe(char[][] board, int row, int col) {

        // Verticaly up
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        
        // Diagonal up left
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        
        // Diagonal up right
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        return true; 

    }

    public static void nQueens(char[][] board, int row) {
           // Base case
           if(row == board.length) {
               count++;
               return;
           }
           // Column loop
           for(int i = 0; i < board.length; i++) {
               if(isSafe(board, row, i)) {
                   board[row][i] = 'Q';
                   nQueens(board, row + 1);
                   board[row][i] = 'x';
               }
           }
    }

    public static void printBoard(char[][] board) {
           System.out.println("----- Chess Board -----");
           for(int i = 0; i < board.length; i++) {
               for(int j = 0; j < board.length; j++) {
                   System.out.print(board[i][j] + " " );
               }
               System.out.println();
            }
            System.out.println();
    }
      

    public static void main(String[] args) {
           int n = 4;
           char board[][] = new char[n][n];

           // Initialize the board
           for(int i = 0; i < n; i++) {
               for(int j = 0; j < n; j++) {
                   board[i][j] = 'x';
               }
           }
           System.out.println();
           nQueens(board, 0);
           System.out.println( "Total number of ways: " + count);
    }    

}