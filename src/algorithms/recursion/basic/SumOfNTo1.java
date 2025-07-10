package algorithms.recursion.basic;

public class SumOfNTo1 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));
        System.out.println(sum1(n));
    }

    static int sum(int n){
        if(n == 0){
            return 0;
        }

        return n + sum(n-1);
    }

    static int sum1(int n){
        return (n * (n+1)) / 2;
    }
}
