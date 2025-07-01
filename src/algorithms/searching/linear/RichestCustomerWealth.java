package algorithms.searching.linear;

//Leetcode 1672
//https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };

        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts){

        int ans = Integer.MIN_VALUE;
        for(int person = 0; person < accounts.length; person++) {

            //when you start a new col, take a new sum fot that row
            int sum = 0;
            for(int account = 0; account < accounts[person].length; account++){
                sum += accounts[person][account];
            }
            //now we have sum of accounts of person
            //check with overall ans
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}



