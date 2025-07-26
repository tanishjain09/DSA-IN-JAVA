package dataStructures.Array;

import java.util.ArrayList;

public class RearrangeArrBySign {
    public static void main(String[] args) {

    }

    public int[] leetcode(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int negIndex = 1,posIndex = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] < 0){
                ans[negIndex] = nums[i];
                negIndex += 2;
            }else{
                ans[posIndex] = nums[i];
                posIndex += 2;
            }
        }
        return ans;
    }

    public void gfg(ArrayList<Integer> arr) {
        int n  = arr.size();
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i = 0; i < n; i++){
            if(arr.get(i) >= 0) {
                pos.add(arr.get(i));
            }else{
                neg.add(arr.get(i));
            }
        }

        if(pos.size() == neg.size()){
            for(int i =0; i < n/2; i++){
                arr.set(2*i, pos.get(i));
                arr.set(2*i +1, neg.get(i));
            }
        }
        else if(pos.size() > neg.size()){
            for(int i = 0; i < neg.size(); i++){
                arr.set(i*2, pos.get(i));
                arr.set(i*2+1, neg.get(i));
            }
            int index = neg.size() * 2;
            for(int i = neg.size(); i < pos.size(); i++){
                arr.set(index,pos.get(i));
                index++;
            }
        }else{
            for(int i = 0; i < pos.size(); i++){
                arr.set(i*2, pos.get(i));
                arr.set(i*2+1, neg.get(i));
            }
            int index = pos.size() * 2;
            for(int i = pos.size(); i < neg.size(); i++){
                arr.set(index,neg.get(i));
                index++;
            }
        }
    }
}
