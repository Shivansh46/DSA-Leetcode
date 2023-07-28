class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int t:nums)
        {
            sum+=t;
        }
        if(sum-target<0 || (sum-target)%2==1)
        {
            return 0;
        }
        int tar=(sum-target)/2;
        int dp[][]=new int[nums.length+1][2*sum+1];
        for(int tp[]:dp)
        {
            Arrays.fill(tp,-1);
        }
        return findans(nums,nums.length-1,tar,dp);
    }
    public static int findans(int arr[],int i,int tar,int dp[][])
    {
        if(i==0)
        {
            if(tar==0 && arr[0]==0)
            {
                return 2;
            }
            if(tar==0 || arr[i]==tar)
            {
                return 1;
            }
            return 0;
        }
        if(dp[i][tar]!=-1) 
        {
            return dp[i][tar];
        }

        int nt=findans(arr,i-1,tar,dp);
        int tk=0;
        if(tar>=arr[i])
        {
            tk=findans(arr,i-1,tar-arr[i],dp);
        }
        return dp[i][tar]=nt+tk;
    }
}
