
/*
1672. Richest Customer Wealth
Problem URL:     https://leetcode.com/problems/richest-customer-wealth/
*/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<accounts.length; i++){
            int each_wealth = 0;
            for(int j=0; j<accounts[i].length; j++)
                each_wealth += accounts[i][j]; 
            max = Math.max(max, each_wealth);
            
        }
        return max;
    }
}