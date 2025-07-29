package com.rockwell.neetcode150.arrayhash;


import java.util.HashSet;

/**
 * 217. Contains Duplicate
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 */
public class Solution217 {

    public static void main(String[] args) {

    }

    /**
     * This method checks if there are any duplicate elements in the given array.
     *
     * @param nums an array of integers
     * @return true if there are duplicates, false otherwise
     */
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

}
