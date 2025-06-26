package dataStructures.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        //syntax
        int[] rnos = new int[5]; //one method
        String[] names = {"tanish","altaf","kapil","akshat"};// another way to create array with inserting element

        int[] marks; //decleration of array. marks is getting defined in the stack
        marks = new int[6]; //initilization: actually here object is being created in the heap
//        System.out.println(marks[0]);
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


//        for(int num : arr){
//            System.out.print(num +" ");
//        }
        System.out.println(Arrays.toString(arr));


    }
}
