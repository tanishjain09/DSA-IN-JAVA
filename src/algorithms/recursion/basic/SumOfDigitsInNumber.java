package algorithms.recursion.basic;

public class SumOfDigitsInNumber {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(sumOfDigit(n));
    }

    static int sumOfDigit(int n){
        if(n == 0){
            return 0;
        }

        return sumOfDigit(n / 10) + n % 10;
    }
}
