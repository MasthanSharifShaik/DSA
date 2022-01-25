/* Leetcode: 1512. Number of Good Pairs
Problem URL:  https://leetcode.com/problems/number-of-good-pairs/
*/
class Solution {
    public int numIdenticalPairs(int[] nums) {
        // since 1 <= nums[i] <= 100       
        int[] count = new int[101];
        int goodPairs = 0;
        for(int ele: nums){
            goodPairs += count[ele]++;
        }
        
           //  for nums = [1,1,1,1]
           //  for ele = 1st 1 => goodPairs = 0 + count[1] = 0 + 0 = 0
           //                      count[1] = 1
            // for ele = 2nd 1 => goodPairs = 0 + count[1] = 0 + 1 = 1 
            //                     count[1] = 2
            // for ele = 3rd 1 => goodPairs = 1 + count[1] = 1 + 2 = 3
            //                     count[1] = 3
            // for ele = 4th 1 => goodPairs = 3 + count[1] = 3 + 3 = 6
            //                     count[1] = 4
                
        
        return goodPairs;
        
    }
}

