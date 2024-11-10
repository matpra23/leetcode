package org.example;

public class Solution3097 {
    public int minimumSubarrayLength(int[] nums, int k) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if(temp > k){
                return i;
            }
        }
        return -1;
    }
}
