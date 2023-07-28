class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()+1][text2.length()+1];
        for(int tp[]:dp)
        {
            Arrays.fill(tp,-1);
        }
        return findans(text1.length()-1,text2.length()-1,text1,text2,dp);
    }
    public static int findans(int i1,int i2,String s1,String s2,int dp[][])
    {
        if(i1<0 || i2<0)
        {
            return 0;
        }
        if(dp[i1][i2]!=-1) return dp[i1][i2];
        int sum1=(int)-1e9;
        int sum2=(int)-1e9;
        if(s1.charAt(i1)==s2.charAt(i2))
        {
            sum1=1+findans(i1-1,i2-1,s1,s2,dp);
        }
        else
        {
            sum2=Math.max(findans(i1-1,i2,s1,s2,dp),findans(i1,i2-1,s1,s2,dp));
        }
        return dp[i1][i2]=Math.max(sum1,sum2);
    }
}
