package algorithms.recursion;

public class Fibo {
    public static void main(String[] args) {
//        System.out.println(fibo(4));

        for(int i =1 ;i<4; i++){
            System.out.println(fibo(i));
        }
    }
    static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
