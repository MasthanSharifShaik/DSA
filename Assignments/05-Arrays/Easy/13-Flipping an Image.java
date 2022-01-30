
/*
LeetCode 832. Flipping an Image
Problem URL:  https://leetcode.com/problems/flipping-an-image/
*/
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
    for(int[] row: image){
     for(int i=0; i<(row.length+1)/2; i++){
         //Reverse each arr[i] with swap (arr[i], arr[length-i-1]) and flip parallely while assigning
         int temp = row[i];
         row[i] = row[image[0].length-i-1]^1;
         row[image[0].length-i-1] = temp^1;
     }
    }
        return image;
    }
}