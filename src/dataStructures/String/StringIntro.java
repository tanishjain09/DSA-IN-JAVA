package dataStructures.String;

public class StringIntro {
    public static void main(String[] args) {
        String name = "Tanish Sethiya";
        System.out.println(name);

        String a = "Tanish";
        System.out.println(a);
        a = "Sethiya"; //this will change string object to Sethiya and Tanish will get unpointed by a,this will not change the previous value by overwriting
        //Tanish will get free by java using garbage collector and a will now have different object in head
        System.out.println(a);
    }
}
