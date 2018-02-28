package com.hillel;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Solution {

    public int sumOfNumbers(int n, IntPredicate criteria) {
        int sum = 0;
        /*for (int i = 0; i <= n; i++) {
            if (criteria.test(i)) {
                sum += i;
            }
        }*/

        IntStream.rangeClosed(0, n)
                .filter(i -> i % 2 == 0)
                .sum();

        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.sumOfNumbers(5, i -> i % 2 == 0);
    }
}
