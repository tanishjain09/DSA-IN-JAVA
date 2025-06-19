package basicProgram;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        int num = (int)(92.19f); //type casting
        System.out.println(num);

        //automatic type promotion in expressions

//        int a = 257;
//        byte b = (byte)(a); //257 % 256 = 1

    }
}
