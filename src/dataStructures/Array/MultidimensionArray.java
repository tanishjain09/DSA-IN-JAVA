package dataStructures.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int [][] matrix = {
//                {1, 2, 3},//0th index
//                {4, 5,},//1st index
//                {6, 7, 8, 9}//2nd index
//        };

        int [][] matrix = new int[3][3];

        //input

        for (int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[row].length; col++){
                matrix[row][col] = sc.nextInt();
            }
        }

        //output
        //1st way
        for (int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[row].length; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        //2nd way
        for (int row = 0; row < matrix.length; row++) {
            System.out.println(Arrays.toString(matrix[row]));
        }

        //3rd way
        for(int[] a : matrix){
            System.out.println(Arrays.toString(a));
        }
    }
}
