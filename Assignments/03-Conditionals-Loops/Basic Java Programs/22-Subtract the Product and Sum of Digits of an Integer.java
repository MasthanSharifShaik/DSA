
/*
LeetCode 1281. Subtract the Product and Sum of Digits of an Integer

*/
class Solution {
    public int subtractProductAndSum(int n) {
       int prod=1, sum=0, temp=n;
        while(temp>0){
            sum+=temp%10;
            prod*=temp%10;
            temp/=10;
        }
        return prod-sum;
    }
}