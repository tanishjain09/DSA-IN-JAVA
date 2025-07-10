package algorithms.recursion.basic;

public class PrintNTo1 {
    public static void main(String[] args) {
        int n = 12;
        print(n);
    }

    static void print(int n){
        if(n <= 0){
            return;
        }
        System.out.print(n+" ");
        print(n-1);
    }
}
