
class Solution {
    
    public int memo(int n, int[] dp){
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        if(n==0){
            return 1;
        } 
        
        int x=memo(n-1, dp);
        int y=memo(n-2, dp);
        return dp[n]=x+y;
        
    }
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp, -1);
        return memo(n, dp);
    }
}
