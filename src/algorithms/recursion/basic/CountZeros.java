package algorithms.recursion.basic;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(count(290110000));
    }

    static int count(int n){
        return helpher(n, 0);
    }
    static int helpher(int n, int c){
        if(n == 0){
            return c;
        }

        int rem = n % 10;

        if(rem == 0){
            return helpher(n/10, c+1);
        }
        return helpher(n/10, c);
    }
}
