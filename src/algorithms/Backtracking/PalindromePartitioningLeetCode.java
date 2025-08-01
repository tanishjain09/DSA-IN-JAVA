package algorithms.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioningLeetCode {
    public static void main(String[] args) {
        System.out.println(partition("aab"));
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        palindromepartitioning(s,0,ans,new ArrayList<>());
        return ans;
    }

    static void palindromepartitioning(String s, int index, List<List<String>> ans, List<String> list){
        if(index == s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i = index; i < s.length(); i++){
            if(isPlaindrome(s, index, i)){
                list.add(s.substring(index, i+1));
                palindromepartitioning(s, i +1,ans, list);
                list.remove(list.size() - 1);
            }
        }
    }

    private static boolean isPlaindrome(String s, int start, int end) {
        while (start <= end){
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
}
