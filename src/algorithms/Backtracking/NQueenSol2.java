package algorithms.Backtracking;

import java.util.ArrayList;
import java.util.List;
public class NQueenSol2 {
    public static void main(String[] args) {

    }

    public static List<List<String>> solveNQueens(int n) {
        char [][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> res = new ArrayList<List<String>>();
        solve(0, board, res);
        return res;
    }

    private static void solve(int col, char[][] board, List<List<String>> res) {
        if(col == board.length){
            res.add(construct(board));
            return;
        }

        for(int row = 0; row < board.length; row++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                solve(col + 1,board, res);
                board[row][col] = '.';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        int duprow = row;
        int dupcol = col;

        while (row >= 0 && col >= 0){
            if(board[row][col] == 'Q') return false;
            row--;
            col--;
        }

        row = duprow;
        col = dupcol;

        while (col >= 0){
            if(board[row][col] == 'Q') return false;
            col --;
        }

        row = duprow;
        col = dupcol;

        while ( col >= 0 && row < board.length){
            if(board[row][col] == 'Q') return false;
            row++;
            col--;
        }
        return true;
    }

    private static List<String> construct(char[][] board){
        List<String> res = new ArrayList<String>();
        for(int i = 0; i < board.length; i++){
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}
