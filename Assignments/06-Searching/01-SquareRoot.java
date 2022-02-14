
/*
LeetCode 69. Sqrt(x)

Problem URL:  https://leetcode.com/problems/sqrtx/
*/

class Solution {
    public int mySqrt(int x) {
        
        long s=0, e=Integer.MAX_VALUE, ans=0;
        
        while(s<=e){
            long mid = s + (e-s)/2;
            
            if(mid*mid <= x) {
                ans = (int)mid;
                s = (int)mid + 1;
            }
            
            else{
                e = (int)mid -1;
            }
        }
        
        return (int)ans;
    }
}
