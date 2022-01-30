
/*
LeetCode 1732. Find the Highest Altitude
Problem URL:  https://leetcode.com/problems/find-the-highest-altitude/
*/

//  class Solution {
//     public int largestAltitude(int[] gain) {
//         int[] alt = new int[gain.length+1];
//         alt[0] =0;
//         int sum = 0;
//         for(int i=0; i<gain.length; i++){
//             alt[i+1] = sum + gain[i];
//             sum += gain[i];
//         }
        
//         return findMax(alt);
//     }
    
//     int findMax(int[] alt){
//         int max = alt[0];
//         for(int i=1; i<alt.length; i++){
//             max = Math.max(max, alt[i]);
//         }
//         return max;
//     }
//  }


class Solution {
       
     public int largestAltitude(int[] gain) {
         int sum = 0, max = 0;
         for(int i=0; i<gain.length; i++){
             sum+=gain[i];
             if(sum>max) { 
                 max = sum; 
             }
         }
         return max;
     }
}
