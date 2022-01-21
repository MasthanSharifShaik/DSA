
/*
1470. Shuffle the Array
Problem URL:     https://leetcode.com/problems/shuffle-the-array/
*/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int j=0;
        for(int i=0; i<n; i++){
            arr[j++] = nums[i];
            arr[j++] = nums[i+n];
        }
        
        return arr;
        
    }
}