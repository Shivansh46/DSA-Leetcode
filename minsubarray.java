
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=Integer.MAX_VALUE;
        int sum=0;
        int i=0;
        int j=0;
        while(i<=j && j<nums.length)
        {
            sum += nums[j];
            if(sum==target)
            {
                ans = Math.min(ans,(j-i+1));
                sum-=nums[i];
                i++;
                j++;
            }
            else if(sum>target)
            {
                ans = Math.min(ans,(j-i+1));
                sum-=nums[i];
                i++;
                sum-=nums[j];
            }else{
                j++;
            }          

        }
        if(ans == 2147483647){
            return 0;
        }
        return ans;
    }
}
