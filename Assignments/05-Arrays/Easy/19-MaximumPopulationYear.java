
/*
1854. Maximum Population Year

Problem URL:  https://leetcode.com/problems/maximum-population-year/
*/

class Solution {
    public int maximumPopulation(int[][] logs) {
        // min year = 1950
        // max year = 2050
        // diff = 101 (including 2050)
        int max_pop = 0;
        int year = 1950;
        int[] arr = new int[101];
        for(int i=0; i<logs.length; i++){
            for(int j=logs[i][0]; j<logs[i][1]; j++) //excluding year of death
            {
                arr[j-1950]++;
            }
        }
       
        
        for(int i=0; i<101; i++){
            if(arr[i]>max_pop){
                max_pop = arr[i];
                year = i+1950; // i +1950 = year at index i 
            }
        }
        
        return year;
    }
}