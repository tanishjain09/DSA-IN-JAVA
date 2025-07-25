package algorithms.searching.binary;

public class PeakIndexIn2DLeetcode {
    public static void main(String[] args) {

    }
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high=  m-1;

        while(low <= high){
            int mid = (low + high) / 2;
            int maxRowIndex = findMax(mat,n,m,mid);
            int left = (mid - 1) >= 0 ? mat[maxRowIndex][mid-1]: -1;
            int right = (mid + 1) < m ? mat[maxRowIndex][mid+1]: -1;
            if(mat[maxRowIndex][mid] > left && mat[maxRowIndex][mid] > right){
                return new int[] {maxRowIndex, mid};
            }
            else if (mat[maxRowIndex][mid] < left){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return new int[] {-1,-1};
    }

    private int findMax(int[][] mat, int n, int m, int col){
        int maxValue = -1;
        int index = -1;
        for(int i = 0; i < n; i++){
            if(mat[i][col] > maxValue){
                maxValue = mat[i][col];
                index = i;
            }
        }
        return index;
    }

}
