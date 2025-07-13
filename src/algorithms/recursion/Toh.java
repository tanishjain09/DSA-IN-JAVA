package algorithms.recursion;

public class Toh {
    public static void main(String[] args) {
        toh(3, 'S', 'H','D');
    }

    static void toh(int n, char s, char h, char d){
        if(n == 1){
            System.out.println( n + "from " + s +" to "+ d);
            return;
        }

        toh(n - 1,s, d, h);
        System.out.println( n + "from " + s +" to "+ d);
        toh(n-1,h, s, d);
    }
}
