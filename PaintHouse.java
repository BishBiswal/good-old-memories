//Tried paint house with back tracking...failed

class Solution {
    int res=Integer.MAX_VALUE;
    
    public void helper(int[][] costs, int r, int c, List<Integer> set, int sum){
        set.add(r);
        sum=sum+costs[r][c];
        if(c==costs[0].length-1){
            res=Math.min(res,sum);
            return;
        }else{
            for(int i=0;i<costs.length;i++){
                if(set.contains(i)){
                    continue;
                }
                helper(costs,i,c+1,set, sum);
                set.remove(set.size()-1);
                
        }

        
        }
 
    }
    public int minCost(int[][] costs) {
        helper(costs, 0,0,new ArrayList<Integer>(),  0);
        return res;
        
    }
}
