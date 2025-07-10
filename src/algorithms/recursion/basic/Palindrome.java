package algorithms.recursion.basic;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palin(1));
    }


    static boolean palin(int n){
        return n == rev(n);
    }

    static int rev(int n){
        //sometimes you might need additional variables in the argument
        //in that case, make another function

        int digits = (int)(Math.log10(n) + 1);
        return helpher(n, digits);
    }

    private static int helpher(int n, int digits){
        if (n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return rem *(int)Math.pow(10,digits - 1) + helpher(n/10, digits-1);
    }
}
