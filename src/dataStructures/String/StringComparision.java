package dataStructures.String;

public class StringComparision {
    public static void main(String[] args) {
//        String a = "Tanish";
//        String b = "Tanish";

        // == -> check the value and reference variable both here both reference variable is same of will give true
//        System.out.println(a == b);
        //to check value only of string we use .equal() method

        String a = new String("Tanish");
        String b = new String("Tanish"); //this will create both outsite pool, in the head both have diff object in hea

        System.out.println(a == b); //will give false
        System.out.println(a.equals(b)); //this will give true as value is same

    }
}
