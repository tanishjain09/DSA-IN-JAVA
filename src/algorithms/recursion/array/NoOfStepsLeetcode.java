package algorithms.recursion.array;

public class NoOfStepsLeetcode {
    public static void main(String[] args) {
    }

    public static int numberOfSteps(int num) {
        return helpher(num, 0);
    }

    private static int helpher(int n, int steps){
        if(n == 0){
            return steps;
        }
        if(n % 2 ==0){
            return helpher(n / 2, steps + 1);
        }else{
            return helpher(n - 1, steps + 1);
        }
    }
}
