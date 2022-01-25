/* Leetcode: 1431. Kids With the Greatest Number of Candies
Problem URL:  https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
*/

class Solution {
    
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<Boolean>();
        int max  = Integer.MIN_VALUE;
        for(int i=0; i<candies.length; i++){
            max = Math.max(max, candies[i]);
        }
        for(int i=0; i<candies.length; i++){
            res.add(candies[i]+extraCandies>=max);
        }
        return res;
    }
    
//     public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
//         List<Boolean> result = new ArrayList<Boolean>();
//         int[] temp = new int[candies.length];
//         for(int i=0; i<candies.length; i++)
//             temp[i] = candies[i];
//         for(int i=0; i<candies.length; i++){
//             temp[i] = candies[i]+extraCandies;
//             result.add(isMax(temp, candies[i]+extraCandies));
//             temp[i] = candies[i];
//         }
        
//         return result;
//     }
    
//     static Boolean isMax(int[] arr, int max){
//         for(int i=0; i< arr.length; i++){
//             if(arr[i]>max)
//                 return false;
//         }
//         return true;
//     }
}