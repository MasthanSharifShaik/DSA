
/*
867. Transpose Matrix
Problem URL:  https://leetcode.com/problems/transpose-matrix/
*/

// class Solution {
//     public int[][] transpose(int[][] matrix) {
//         for(int i=0; i<matrix.length; i++){
//             for(int j=0; j<matrix[i].length; j++){
//                 if(i==j)
//                 break;
//                 else{
//                     int temp = matrix[i][j];
//                     matrix[i][j] = matrix[j][i];
//                     matrix[j][i] = temp;
//                 }
//             }
//         }
//         return matrix;
//     }
// }
//above soln doesn't work if matrix length is even


class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        
        return transpose;
    }
}

// TC: O(r*c)
// SC: O(c*r)