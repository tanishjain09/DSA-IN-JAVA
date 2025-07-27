package algorithms.recursion.string;

import java.security.AllPermission;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class powerSubSequence {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(AllPossibleStrings(s));
    }
    public static List<String> AllPossibleStrings(String s) {
        // Code here
        List<String> ans = new ArrayList<>();
        char[] ch = s.toCharArray();
        StringBuilder ds = new StringBuilder();
        substring(0, ch, ans,ds);
        Collections.sort(ans);

        return ans;
    }

    private static void substring(int index, char[] ch, List<String> ans, StringBuilder ds){
        if(index == ch.length){
            if(!ds.isEmpty()){
                ans.add(ds.toString());
                return;
            }
            return;
        }

        ds.append(ch[index]);
        substring(index + 1, ch, ans, ds);
        ds.deleteCharAt(ds.length() - 1);
        substring(index+1,ch,ans,ds);
    }
}
