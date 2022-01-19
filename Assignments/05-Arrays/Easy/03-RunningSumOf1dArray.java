
/*
1480. Running Sum of 1d Array
Problem URL:     https://leetcode.com/problems/running-sum-of-1d-array/
*/

class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] runningSum = new int[n]; 
        // runningSum[0] = nums[0];
        // for(int i=1; i<n; i++){
        //     runningSum[i] = runningSum[i-1]+ nums[i];
        // }
        
        
        int sum =0;
        for(int i=0; i<n; i++){
            sum +=  nums[i];
            runningSum[i] = sum;
        }
        return runningSum;
        
        
    }
}