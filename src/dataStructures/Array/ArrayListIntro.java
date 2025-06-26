package dataStructures.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
//        list.add(16);
//        list.add(9);
//        list.add(1);
//        list.add(4);
//        list.add(7);

//        list.set(0,9);
//        list.remove(1);
//        System.out.println(list);

        //input
        for(int i = 0; i < 5; i++){
            list.add(sc.nextInt());
        }

        //output
        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i)); //list[index] like array not work here
        }
    }
}


