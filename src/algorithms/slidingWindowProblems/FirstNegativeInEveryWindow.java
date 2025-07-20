package algorithms.slidingWindowProblems;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class FirstNegativeInEveryWindow {
    public static void main(String[] args) {

    }
        static List<Integer> firstNegInt(int[] arr, int k) {
            List<Integer> result = new ArrayList<>();
            Deque<Integer> dq = new ArrayDeque<>();

            int i = 0;
            int j = 0;
            int n = arr.length;

            while(j < n){
                //calculation
                if(arr[j] < 0){
                    dq.addLast(j);
                }

                if( (j - i + 1) < k){
                    j++;
                } else if ( (j - i + 1) == k ) {

                    if(!dq.isEmpty()){
                        result.add(arr[dq.peekFirst()]);
                    } else{
                        result.add(0);
                    }

                    if(!dq.isEmpty() && dq.peekFirst() == i){
                        dq.pollFirst();
                    }
                    i++;
                    j++;
                }
            }
            return result;
        }
    }

