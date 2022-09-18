//House Robber
//recursion code

class Solution {
    
    public int memo(int[] nums, int idx, int prev){
        if(idx==nums.length) return 0;
        
        int yes=(prev==0)?memo(nums, idx+1, 1)+nums[idx]:0;
        int no=memo(nums, idx+1, 0);
            
        return Math.max(yes,no);
    }
    public int rob(int[] nums) {
        return memo(nums,0,0);       
    }
}

//Memoize

class Solution {
    
    public int memo(int[] nums, int idx, int prev, int[][] dp){
        if(idx==nums.length) return 0;
        if(dp[idx][prev]!=-1) return dp[idx][prev]; 
        
        int yes=(prev==0)?memo(nums, idx+1, 1, dp)+nums[idx]:0;
        int no=memo(nums, idx+1, 0, dp);
            
        return dp[idx][prev]=Math.max(yes,no);
        
    }
    public int rob(int[] nums) {
        int[][] dp=new int[nums.length][2];
        for(int i=0;i<dp.length;i++){
            dp[i][1]=-1;
            dp[i][0]=-1;
        }
        
        return memo(nums,0,0, dp);
        
        
        
    }
}
