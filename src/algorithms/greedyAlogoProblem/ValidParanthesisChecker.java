package algorithms.greedyAlogoProblem;

public class ValidParanthesisChecker
{
    public static void main(String[] args) {
        String s = "(*)";
        System.out.println(checkValidString(s));
    }
    public static boolean checkValidString(String s) {
        int min = 0, max = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                min++;
                max++;
            }else if(c == ')'){
                min--;
                max--;
            }else{
                min--;
                max++;
            }
            if(min < 0) min = 0;
            if(min > max) return false;
        }
        return min == 0? true: false;
    }
}
