package com.like.LeetCode;

/**
 * @auther like
 * @create 2024/7/22 09:54
 */
public class Leetcode01 {
    public static void main(String[] args) {
int[] nu = {2, 7, 11, 15};
        int e[] = new int[2];
e = twoSum(nu, 9);
System.out.println(e[0] + " " + e[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        int d[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    d[0] = i;
                    d[1] = j;
                }
            }

        }
        return  d;

}


}
