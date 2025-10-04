class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int[] a:dp)     Arrays.fill(a, -1);
        return minsum( 0, 0, dp);
    }
    public static int minsum(int r, int c, int[][] dp){
        if(r==dp.length-1 && c==dp[0].length-1)
            return 1; 
        if(r>=dp.length ||  c>=dp[0].length)
            return 0;
        if(dp[r][c]!=-1)    return dp[r][c];
        
        int right=minsum( r, c+1, dp);
        int down=minsum( r+1, c, dp);
        return dp[r][c]=right+down;
    }
}