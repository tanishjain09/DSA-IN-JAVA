package algorithms.recursion.string;

public class reverseStr {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(reverse(str));
    }
    private static String reverse(String str){
        if(str == null || str.length() <= 1){
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
