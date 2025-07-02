package dataStructures.String;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.2373f;
//        System.out.printf("Formatted number is %.2f",a);

        System.out.printf("Pie: %.3f",Math.PI);
        System.out.println();
        System.out.printf("Hello my name is %s and I am %s","Tanish","miserable");

        System.out.println("a" + 1);
        //integer will be converted to Integer that will call toString()
    }
}
