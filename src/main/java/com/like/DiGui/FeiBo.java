package com.like.DiGui;

/**
 * @auther like
 * @create 2024/7/26 10:39
 */
public class FeiBo {
    public static void main(String[] args) {
for (int i = 1; i <= 10; i++){
            System.out.println(fib(i));
        }
    }

    public static int fib(int n) {
        if(n <= 2) return 1;

        int[] array = new int[n + 1];

        array[1] = 1;
        array[2] = 1;
        for (int i = 3; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }

}

