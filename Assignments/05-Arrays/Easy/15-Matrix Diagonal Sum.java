
/*
1572. Matrix Diagonal Sum
Problem URL:  https://leetcode.com/problems/matrix-diagonal-sum/
*/
class Solution {
    public int diagonalSum(int[][] mat) {
        int primary_sum = 0, secondary_sum =0, n=mat.length;
        for(int i=0; i< mat.length; i++){
           primary_sum += mat[i][i];
           secondary_sum += mat[i][n-i-1];
        }
      
        return (n%2==0)? (primary_sum + secondary_sum): (primary_sum + secondary_sum)-mat[n/2][n/2];
    }
}