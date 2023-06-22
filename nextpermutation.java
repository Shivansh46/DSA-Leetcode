class Solution {
    public void nextPermutation(int[] nums) {
       int ind=-1;
       for(int i=nums.length-2;i>=0;i--)
       {
           if(nums[i+1]>nums[i])
           {
               ind=i;
               break;
           }
       }

       // base case
       if(ind==-1)
       {
           Arrays.sort(nums);
           
           return;
        
       }

       for(int i=nums.length-1;i>ind;i--)
       {
           if(nums[i]>nums[ind])
           {
               int temp=nums[i];
               nums[i]=nums[ind];
               nums[ind]=temp;
               break;
           }
       }
       Arrays.sort(nums,ind+1,nums.length);
    }
}
