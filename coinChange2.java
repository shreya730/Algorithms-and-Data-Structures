class Solution {
    public int change(int amount, int[] coins) {
     int [][] dp=new int[coins.length+1][amount+1];
        for(int i=0;i<coins.length+1;i++){
            for(int j=0;j<amount+1;j++){
                if(j==0) dp[i][j]=1;
                else if(i==0) dp[i][j]=0;
                else{
                    dp[i][j]=dp[i-1][j]+(j-coins[i-1]<0?0:dp[i][j-coins[i-1]]);
                }
                    
            }
        }
        return dp[coins.length][amount];
    }
}