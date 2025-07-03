package algorithms.searching.binary;
//Question -> leetcode 744

public class Problem3LeetCode {
    public static void main(String[] args) {
        char[] letter = {'c', 'f', 'j'};
        System.out.println(solution(letter,'a'));
    }
    static char solution(char[] letter,char target){
        int start = 0;
        int end = letter.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target > letter[mid]){
                start = mid + 1;
            } else if (target < letter[mid]) {
                end = mid - 1;
            }
        }
        return letter[start % letter.length];
    }
}
