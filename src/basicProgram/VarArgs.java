package basicProgram;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(2,3,4,4,5,5,6,6,6,7);
        multiple(1,2,"sting","tanish");
    }

    static void multiple(int a, int b, String ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
