package algorithms.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPath {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
//        allPath("", board,0, 0);
        allPathPrint("", board, 0, 0, path, 1);
    }

    static void allPathPrint(String p , boolean[][] maze, int r, int c, int[][] path, int step){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            path[r][c] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
                System.out.println(p);
                System.out.println();
            return;
        }


        if(!maze[r][c]){
            return;
        }
        //i am considering this block in my path
        maze[r][c]  = false;
        path[r][c] = step;
        if(r < maze.length - 1){
            allPathPrint(p + 'D', maze,r+1, c, path, step + 1);
        }

        if(c < maze[0].length - 1){
            allPathPrint(p + 'R', maze, r, c+1, path, step +1);
        }

        if(r > 0){
            allPathPrint(p + 'U', maze, r-1, c, path, step+1);
        }

        if(c > 0){
            allPathPrint(p + 'L', maze, r, c -1, path, step+1);
        }

        //this line is where the function will over
        //so before the function gets removed, also removed the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }

    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> ans = findPath(maze, maze.length);
        return ans;
    }

    private ArrayList<String> findPath(int[][] maze, int n){
        int[][] vis = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                vis[i][j] = 0 ;
            }
        }

        ArrayList<String> ans = new ArrayList<>();
        if(maze[0][0] == 1) solve(0, 0,n,maze,vis,"",ans);
        return ans;
    }

    private void solve(int r, int c, int n, int[][] m, int[][] vis, String move, ArrayList< String > ans ) {
        if (r == n - 1 && c == n - 1) {
            ans.add(move);
            return;
        }

        //downwards
        if (r + 1 < n && m[r + 1][c] == 1 && vis[r + 1][c] == 0) {
            vis[r][c] = 1;
            solve(r + 1, c, n, m, vis, move + 'D', ans);
            vis[r][c] = 0;
        }

        //left
        if (c - 1 >= 0 && m[r][c - 1] == 1 && vis[r][c - 1] == 0) {
            vis[r][c] = 1;
            solve(r, c - 1, n, m, vis, move + 'L', ans);
            vis[r][c] = 0;
        }
        //right
        if (c + 1 < n && m[r][c + 1] == 1 && vis[r][c + 1] == 0) {
            vis[r][c] = 1;
            solve(r, c + 1, n, m, vis, move + 'R', ans);
            vis[r][c] = 0;
        }

        //upward
        if (r - 1 >= 0 && m[r - 1][c] == 1 && vis[r - 1][c] == 0) {
            vis[r][c] = 1;
            solve(r - 1, c, n, m, vis, move + 'U', ans);
            vis[r][c] = 0;
        }
    }
}
