package com.like.sort;

/**
 * @auther like
 * @create 2024/7/24 10:47
 */
public class select {
        public static void main(String[] args) {
            int[] arr = {64, 25, 12, 22, 11};
            int n = arr.length;

            // 遍历列表的每一个元素
            for (int i = 0; i < n - 1; i++) {
                // 假设初始位置i号索引位置的元素是最小值
                int minIndex = i;

                // 从初始位置i号索引位置之后的元素中找出最小值
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }

                // 将找到的最小值与初始位置i号索引位置的元素交换
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }

            // 打印排序后的列表
            System.out.print("Sorted array: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

    public select() {

    }

}

