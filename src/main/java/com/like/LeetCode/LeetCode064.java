package com.like.LeetCode;

/**
 * @auther like
 * @create 2024/8/17 09:06
 */


public class LeetCode064 {
    /**
     * dp[]版
     */
    public int minPathSum(int[][] f) {
        int n = f.length, m = f[0].length;
        int dp[][] = new int[n][m];
        dp[0][0]= f[0][0];
        for (int i = 0; i < f.length; i++){
            for (int j = 0; j < f[0].length; j++){
                if (i== 0 && j == 0)continue;
                if (i== 0){
                    dp[i][j] = dp[i][j-1] + f[i][j];
                } else if (j==0) {
                    dp[i][j] = dp[i-1][j] + f[i][j];
                }else
                    dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + f[i][j];
            }
        }
        return dp[n-1][m-1];
    }
    /**
     * 无dp[]版
     */
    public static int minPathSum2(int[][] f) {
        int  n = f.length, m = f[0].length;
        for (int i = 0; i < f.length; i++){
            for (int j = 0; j < f[0].length; j++){
                if (i== 0 && j == 0)continue;
                if (i== 0){
                    f[i][j] = f[i][j-1] + f[i][j];
                } else if (j==0) {
                    f[i][j] = f[i-1][j] + f[i][j];
                }else
                    f[i][j] = Math.min(f[i-1][j], f[i][j-1]) + f[i][j];
            }
        }
        return f[n-1][m-1];
    }

    public static void main(String[] args) {
        minPathSum2(new int[][]{{1,3,1},{1,5,1},{4,2,1}});
    }
}
