package algorithms.recursion.basic;

public class Fibo {
    public static void main(String[] args) {
//        System.out.println(fibo(4));

//        for(int i =0 ;i<11; i++){
//            System.out.println(fiboFormula(i));
//        }

        System.out.println(fiboFormula(55));
    }
    static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    static long fiboFormula(int n){

        return (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }
}
