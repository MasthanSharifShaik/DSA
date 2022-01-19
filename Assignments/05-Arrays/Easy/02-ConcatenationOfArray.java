
/*
LeetCode: 1929. Concatenation of Array
Problem URL:      https://leetcode.com/problems/concatenation-of-array/
*/

class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        
        return ans;
    }
}
