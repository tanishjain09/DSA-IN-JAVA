package algorithms.searching.binary;

public class KokoEatingBananaLeetcode {
    public static void main(String[] args) {
        int[] piles = {805306368,805306368,805306368};
        int h = 1000000000;
        System.out.println(minEatingSpeed(piles,h));
    }

    static int minEatingSpeed(int[] piles, int h) {
        int s = 1;
        int e = maxInPiles(piles);

        while (s <= e){
            int mid = s + (e - s) / 2;

            int sum = 0;
            for(int n : piles){
                sum += (int)Math.ceil((double) n / mid );
            }

            if(sum <= h){
                e = mid -1;
            }else{
                s = mid+1;
            }
        }
        return s;
    }

    static private int maxInPiles(int[] piles){
        int max = Integer.MIN_VALUE;

        for(int n : piles){
            if (n > max){
                max = n;
            }
        }
        return max;
    }
}
