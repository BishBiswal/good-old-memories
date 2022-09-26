
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

//Leetcode 746

class Solution {
    
    public int memo(int[] cost, int idx, int[] dp){
        
        if(idx>=cost.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
        
        
        int x=cost[idx]+memo(cost,idx+1,dp);
        int y=cost[idx]+memo(cost,idx+2,dp);
        
        return dp[idx]=Math.min(x,y);
        
    }
    
    
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length];
        Arrays.fill(dp, -1);
        
        int a=memo(cost,0, dp);
        int b=memo(cost,1, dp);
        return Math.min(a,b);
        
    }
}


