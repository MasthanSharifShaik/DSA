
/*
1295. Find Numbers with Even Number of Digits
Problem URL:  https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
*/

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(isEvenDigits(nums[i])){
                count++;
            }
        }
        
        return count;
    }
    
//     boolean isEvenDigits(int n){
//         int temp = n, digit_count=0;
        
//         while(n>0){
//             n/=10;
//             digit_count++;
//         }
        
//         return digit_count%2==0;
//     }
    
    boolean isEvenDigits(int n){
        int digit_count = (int)Math.log10(n)+1;
        return digit_count%2==0;
    }
    
    
}
