class Solution {
    public int change(int amount, int[] coins) {
        int dp[][]=new int[amount+1][coins.length+1];
        for(int tem[]:dp)
        {
            Arrays.fill(tem,-1);
        }
        return findans(amount,coins,coins.length-1,dp);
    
    }
    public static int findans(int am,int coin[],int i,int dp[][])
    {
        if(i==0)
        {
            if(am%coin[i]==0)
            {
                return 1;
            }
            return 0;
        }
        if(dp[am][i]!=-1) return dp[am][i];
        int nt=findans(am,coin,i-1,dp);
        int tk=0;
        if(coin[i]<=am)
        {
            tk=findans(am-coin[i],coin,i,dp);
        }
        return dp[am][i]=nt+tk;
    }
}
