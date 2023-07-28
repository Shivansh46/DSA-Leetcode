class Solution {
    public int subarraySum(int[] nums, int k) {
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return findans(0, k, nums,dp);
    }

    public static int findans(int i, int tar, int arr[],int dp[]) {
        if(i>=arr.length)
        {
            return 0;
        }
        int ans=0;
        int sum=0;
        for(int j=i;j<arr.length;j++)
        {
            sum+=arr[j];
            if(tar==sum)
            {
                ans++;
            }
        }
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        return dp[i]=ans+findans(i+1,tar,arr,dp);
    }
}
