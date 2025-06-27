package OnlinePlatformProblems;
//Question 1 -> Leetcode 1295
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896,1589};
        System.out.println(solution(arr));
    }
    static int solution(int[] arr){
        int count = 0;
        for(int num : arr){
            if(isEvenDigit(num)){
                count++;
            }
        }
        return count;
    }
    static boolean isEvenDigit(int num){
        int numberOfDigit = count(num);
        return (numberOfDigit % 2) == 0;
    }
    static int count(int num){
        int count = 0;
        while(num > 0) {
            count ++;
            num = num/10;
        }
        return count;
    }
}
