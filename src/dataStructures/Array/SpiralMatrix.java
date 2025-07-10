package dataStructures.Array;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}
        };

        spiralMatrix(matrix);

    }
    static void spiralMatrix(int[][] arr){

        int n = arr.length;
        int m = arr[0].length;
        int left = 0;
        int right = m - 1;
        int top = 0;
        int bottom = n -1;

        while (top <= bottom && left <= right ){
            for(int i = left; i <= right; i++){
                System.out.print(arr[top][i] +" ");
            }
            top++;
            for(int i = top; i <= bottom; i++){
                System.out.print(arr[i][right]+ " ");
            }
            right--;
            //check here that if the top is still greater equal to bottom
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    System.out.print(arr[bottom][i] +" ");
                }
                bottom--;
            }
            //here we check  for left and still greater than equal to right
            if(left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }
}
