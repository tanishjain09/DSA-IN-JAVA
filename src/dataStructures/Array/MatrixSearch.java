package dataStructures.Array;

import java.util.Arrays;

public class MatrixSearch {
    public static void main(String[] args) {
        //here matrix is sorted row wise and col wise
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        System.out.println(Arrays.toString(search(arr,39)));
    }

    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }
            if(matrix[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}
