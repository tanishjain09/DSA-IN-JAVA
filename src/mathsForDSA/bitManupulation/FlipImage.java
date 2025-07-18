package mathsForDSA.bitManupulation;

public class FlipImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};

        for(int[] row: image){
            //reverse this array
            int start = 0;
            int end = image[0].length - 1;
            while (start<=end){
                int temp = row[start] ^ 1;
                row[start] = row[end] ^1;
                row[end] = temp;
                start++;
                end--;
            }
        }

    }
}
