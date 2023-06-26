class Solution {
    public int pivotIndex(int[] nums) {
        int rightsum=0;
        for(int element:nums)
        {
            rightsum+=element;
        }
        int leftsum=0;
        
        if(leftsum==rightsum-nums[0])
        {
            return 0;
        }
        for(int i=1;i<nums.length;i++)
        {
            leftsum+=nums[i-1];
            int ccv=0;
            ccv=rightsum-leftsum-nums[i];
            if(leftsum==ccv)
            {
                return i;
            }
        }
        return -1;
    }
}
