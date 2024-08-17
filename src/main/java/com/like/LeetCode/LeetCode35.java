package com.like.LeetCode;

/**
 * @auther like
 * @create 2024/7/26 09:13
 */
//考虑一个数组 nums = [1, 3, 5, 6] 和 target = 5：
//
//	•	初始状态：i = 0, j = 3
//	•	第一次迭代：m = 1, nums[m] = 3, target > nums[m]，所以 i = 2
//	•	第二次迭代：m = 2, nums[m] = 5, target <= nums[m]，所以 j = 1
//	•	结束循环，返回 i 的值 2
//
//考虑一个数组 nums = [1, 3, 5, 6] 和 target = 2：
//
//	•	初始状态：i = 0, j = 3
//	•	第一次迭代：m = 1, nums[m] = 3, target < nums[m]，所以 j = 0
//	•	第二次迭代：m = 0, nums[m] = 1, target > nums[m]，所以 i = 1
//	•	结束循环，返回 i 的值 1
//
//使用 return j，则结果会是不同的。例如，在最后一个例子中，返回的将是 j 的值 0，而不是目标值应该插入的位置 1。
public class LeetCode35 {
    public int searchInsert(int[] nums, int target) {
        int i = 0; int j = nums.length - 1;
        while(i<=j){
            int m = (i+j)>>>1;
            if(target<=nums [m])
            {
                j = m - 1;
            }

            else
            {
                i = m + 1;
            }
        }
        return i;
    }

}
