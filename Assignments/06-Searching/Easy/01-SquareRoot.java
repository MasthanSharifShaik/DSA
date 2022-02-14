
/*
LeetCode 69. Sqrt(x)

Problem URL:  https://leetcode.com/problems/sqrtx/
*/
// TC: O(logN)--Worst Case
// SC: O(1) 

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


// Similar approach
class Solution {
    public int mySqrt(int x) {
        int s = 1, e = x/2, sqrt = s + (e-s)/2;
        if(x==0) return 0;
        
        while(s<=e){
            if(sqrt==x/sqrt){
                return sqrt;
            }
            
            else if(sqrt > x/sqrt){
                e = sqrt - 1;
            }
            
            else if(sqrt < x/sqrt){
                s = sqrt +1;
            }
            
            sqrt = s+ (e-s)/2;
        }
        
        if(sqrt > x/sqrt)
            return sqrt-1;
        else
            return sqrt;
    }
}
