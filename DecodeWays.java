class Solution {
    
    public int memo(String str, int idx,int[] dp){
        if(idx==str.length()) return 1;
        if(dp[idx]!=-1) return dp[idx];
        int a=0;
        int b=0;
            if(str.charAt(idx)!='0'){
                int one=memo(str, idx+1, dp);
                a=one;
            }
            if(idx+1<str.length()){
                int code=(str.charAt(idx)-'0')*10+(str.charAt(idx+1)-'0');
                if(code>=10 && code<=26){
                    int two=memo(str, idx+2, dp);
                    b=two;
                } 
            }
        
        return dp[idx]=a+b;
        
        
    }
    public int numDecodings(String s) {
        
        int[] dp=new int[s.length()];
        Arrays.fill(dp, -1);
        
       return memo(s, 0, dp);
}
}
