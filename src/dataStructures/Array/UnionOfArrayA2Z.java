package dataStructures.Array;

import java.util.ArrayList;

public class UnionOfArrayA2Z {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,3,4,4,5};

        ArrayList<Integer> list = union1(arr1,arr2);
        System.out.println(list);
    }
    //brute force is hash set

    static ArrayList<Integer> union1(int[] arr1, int[] arr2){ // 2 pointer - Time and Space O(n+m)
        ArrayList<Integer> union = new ArrayList<>();
        int n = arr1.length;
        int m = arr2.length;
        int i = 0;
        int j = 0;

        while (i<n && j<m){
            if(arr1[i] <= arr2[j]){
                if(union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            }else{
                if(union.size() == 0 || union.get(union.size() - 1) != arr2[j])
                    union.add(arr2[j]);
                j++;
            }
        }

        while (i<n){
            if(arr1[i] <= arr2[j]){
                if(union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            }
        }

        while (j<m ){
            if(union.size() == 0 || union.get(union.size() - 1) != arr2[j])
                union.add(arr2[j]);
            j++;
        }
        return union;
    }

}
