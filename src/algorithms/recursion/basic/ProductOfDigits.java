package algorithms.recursion.basic;

public class ProductOfDigits {
    public static void main(String[] args) {
        int n = 1302;
        System.out.println(productOfDigit(n));
    }

    static int productOfDigit(int n){
        if(n == 0){
            return 1;
        }

        return productOfDigit(n / 10) * (n % 10);
    }
}
