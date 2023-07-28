class Solution {
    public int[] countBits(int n) {
        int dp[]=new int[n+1];
        int ans[]=new int[n+1];
        for(int i=0;i<n+1;i++)
        {
            ans[i]=findans(i,dp);
        }
        return ans;
        
    }
    public static int findans(int i,int dp[])
    {
        if(i==0||i==1)
        {
            return i;
        }
        if(dp[i]!=0) return dp[i];
        int count=0;
        if(i%2==0)
        {
            count=findans(i/2,dp);
        }
        else
        {
            count=findans(i/2,dp)+1;
        }
        return dp[i]=count;
    }
}
