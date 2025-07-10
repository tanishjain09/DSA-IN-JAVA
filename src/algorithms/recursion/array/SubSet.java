package algorithms.recursion.array;

import java.util.ArrayList;
import java.util.List;

//by iteration
public class SubSet {
    public static void main(String[] args) {

    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num : arr){  //for every number in array
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>();

            }
        }

        return outer;
    }
}
