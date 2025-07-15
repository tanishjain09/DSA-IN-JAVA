package algorithms.recursion.string;

import java.util.ArrayList;

public class PrintKeypadCombination {
    public static void main(String[] args) {
        printKeypadCombination("","23");
        System.out.println();
        System.out.println(printKeyadCombinationReturn("","12"));
    }

    static void printKeypadCombination(String p, String up){
        if( up.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        int digit = up.charAt(0) - '0';//this will convert like '2' into 2

        for(int i = (digit - 1) * 3; i < digit * 3; i++){
            char ch = (char)('a' + i);
            printKeypadCombination(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> printKeyadCombinationReturn(String p, String up){
        if( up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';//this will convert like '2' into 2

        ArrayList<String> list = new ArrayList<>();

        for(int i = (digit - 1) * 3; i < digit * 3; i++){
            char ch = (char)('a' + i);
            list.addAll(printKeyadCombinationReturn(p + ch, up.substring(1)));
        }
        return list;
    }
}
