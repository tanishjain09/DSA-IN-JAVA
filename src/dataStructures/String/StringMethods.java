package dataStructures.String;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Tanish Sethiya ";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('a'));
        System.out.println("      Tanish     ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
