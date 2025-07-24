package algorithms.searching.binary;

import java.util.Arrays;

public class SerachInSortedMatrix2 {
    public static void main(String[] args) {
        //matrix is sorted row and col wise
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target = 29;
        int[] ans = search(matrix, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr, int target){
        int row = 0;
        int col = arr[0].length - 1;
        while(row < arr.length && col >= 0){
            if(arr[row][col] == target){
                return new int[]{row,col};
            }else if(arr[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
        return new int[] {-1,-1};
    }
}
