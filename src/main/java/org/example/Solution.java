package org.example;

public class Solution {

    /**
     * Finds the maximum digit among the digits in the given string representation of a number.
     *
     * @param n The string representation of the number.
     * @return The maximum digit as an integer.
     */
    public int minPartitions(String n) {
        char max = 0;

        for (char val : n.toCharArray()) {
            if (val > max) max = val;
        }

        return max - '0';
    }
}
