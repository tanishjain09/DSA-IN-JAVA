package algorithms.searching.linear;

//search for a range in a array instead of whole array
public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,23,21,14,13,-11,2149,13,114,131,52,-131,-1313,13};
        int target = -131;
        System.out.println(searchInRange(arr,target,1,arr.length-1));
    }

    static int searchInRange(int[] arr, int target, int start, int end){
        if (arr.length == 0) return -1;

        for(int index = start; index <= end ; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
