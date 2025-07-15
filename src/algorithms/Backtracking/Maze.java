package algorithms.Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        pathOfMaze("", 3, 3);
//        System.out.println();
//        System.out.println(pa thOfMazeRet("", 3, 3));
//        System.out.println(pathOfMazeDiagonal("", 3, 3));
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        pathOfMazeWithRestriction("", board, 0, 0);
    }

    static int count(int r, int c){ //this will give the no of way to go in maze form 3,3 to 1,1
        if(r == 1 || c == 1){
            return 1;
        }
        int left = count(r - 1, c);
        int right = count(r, c-1);

        return left+right;
    }

    static void pathOfMaze(String p ,int r, int c){
        if(r == 1 && c == 1){
            System.out.print(p + " ");
            return;
        }

        if(r > 1){
            pathOfMaze(p + 'D',r-1, c);
        }

        if(c > 1){
            pathOfMaze(p + 'R', r, c-1);
        }
    }


    static ArrayList<String> pathOfMazeRet(String p , int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r > 1){
            list.addAll(pathOfMazeRet(p + 'D', r-1, c));
        }

        if(c > 1){
            list.addAll(pathOfMazeRet(p + 'R', r, c-1));
        }
        return list;
    }

    static ArrayList<String> pathOfMazeDiagonal(String p , int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r > 1 & c > 1){
            list.addAll(pathOfMazeDiagonal(p + 'D', r-1, c-1));
        }

        if(r > 1){
            list.addAll(pathOfMazeDiagonal(p + 'V', r-1, c));
        }

        if(c > 1){
            list.addAll(pathOfMazeDiagonal(p + 'H', r, c-1));
        }

        return list;
    }

    static void pathOfMazeWithRestriction(String p , boolean[][] maze,int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }
        if(r < maze.length - 1){
            pathOfMazeWithRestriction(p + 'D', maze,r+1, c);
        }

        if(c < maze[0].length - 1){
            pathOfMazeWithRestriction(p + 'R', maze, r, c+1);
        }
    }

}
