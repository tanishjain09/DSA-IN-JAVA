package basicProgram;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
//        sum();
        int ans = sum2(1 ,2);
        System.out.println(ans);
    }

    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int n1 = input.nextInt();
        System.out.println("Enter number 2: ");
        int n2 = input.nextInt();
        int sum = n1 + n2;
        System.out.println("Sum is :"+sum);
    }
    static int sum2(int a , int b){
        int sum = a + b;
        return sum;
    }
}
