
/*
989. Add to Array-Form of Integer

Problem URL: https://leetcode.com/problems/add-to-array-form-of-integer/
*/

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> arr = new ArrayList<>();
        for(int i= num.length-1; i>=0; i--){
            arr.add((num[i]+k)%10);
            k= (num[i]+k)/10;
        }
        
        while(k>0){
            arr.add(k%10);
            k/=10;
        }
        
        Collections.reverse(arr);
        return arr;
    }
    
}
