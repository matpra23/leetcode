package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0,1,1,3};
        Solution1829 s = new Solution1829();
        System.out.println(Arrays.toString(s.getMaximumXor(arr, 2)));
    }
}