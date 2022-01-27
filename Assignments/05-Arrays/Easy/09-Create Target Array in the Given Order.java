
/*
1389. Create Target Array in the Given Order
Problem URL:   https://leetcode.com/problems/create-target-array-in-the-given-order/
*/

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
       // ArrayList<Integer> res = new ArrayList<Integer>();
       //  for(int i = 0; i<nums.length; i++) {
       //      res.add(index[i], nums[i]);
       //  }
       //  int[] target = new int[res.size()];
       //  for(int i = 0; i<res.size(); i++) {
       //      target[i] = res.get(i);
       //  }
       //  return target;
        int[] target = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            insert(target, nums[i],  index[i]);
        }
        return target;
    }
    
    void insert(int[] arr, int value, int ind){
        for(int i= arr.length-1; i> ind; i--){
            arr[i] = arr[i-1];
        }
        arr[ind] = value;
    }
    
}