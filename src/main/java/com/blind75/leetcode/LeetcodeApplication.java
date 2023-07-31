package com.blind75.leetcode;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
@Slf4j
public class LeetcodeApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LeetcodeApplication.class, args);
    }

    /**
     * 1. Two Sum
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     * Example 1:
     * <p>
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     * Example 2:
     * <p>
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     * Example 3:
     * <p>
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 2 <= nums.length <= 104
     * -109 <= nums[i] <= 109
     * -109 <= target <= 109
     * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
     */
    public int[] twoSum(int[] num, int target) {
        int[] result = new int[2];
        boolean flag = false;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] + num[j] == target && i!=j) {
                    flag = true;
                    result[0] = i;
                    result[1] = j;
                    break;
                }
                if (flag){
                    break;
                }
            }
        }
        return result;
    }

    public int[] twoSumv2(int[] nums, int target) {
        int[] result = new int[2];
        out:
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    result[0] = i;
                    result[1] = j;
                    break out;
                }
            }
        }
        return result;
    }

    @Override
    public void run(String... args)  {
        int[] num = {2,7,11,15};
        int[] ints = twoSum(num, 9);
        log.info("twoSum: {}", ints);

        int[] intsv2 = twoSum(num, 9);
        log.info("twoSumv2: {}", intsv2);

    }
}
