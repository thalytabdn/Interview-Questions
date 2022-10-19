//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times. 
//You may assume that the majority element always exists in the array.

class Solution {
    public int majorityElement(int[] nums) {
        int c = -1;
        int v = 0;
        for(int i = 0; i<nums.length; i++){
            if(v==0){
                c = nums[i];
            }
            if(c == nums[i]){
                v++;
            } else{
                v--;
            }
        }
        return c;
    }
}
