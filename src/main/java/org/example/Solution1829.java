package org.example;

public class Solution1829 {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] result = new int[nums.length];
        int XORR = nums[0];
        int maxXOR = (1 << maximumBit) - 1;
        for (int i = 1; i <nums.length; i++) {
            XORR ^= nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = XORR ^ maxXOR;
            XORR ^= nums[nums.length-1-i];
        }
        return result;
    }
}
