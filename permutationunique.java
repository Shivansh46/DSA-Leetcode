class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> ans=new ArrayList<>();
        findans(ans,nums,0);
        return ans;
    }
    public void findans(List<List<Integer>> ans,int nums[],int start)
    {
        if(start==nums.length)
        {
            ArrayList <Integer> toadd=new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                toadd.add(nums[i]);
            }
            ans.add(new ArrayList(toadd));
            return;
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int i=start;i<nums.length;i++)
        {
            if(hs.add(nums[i]))
            {
                int temp=nums[start];
                nums[start]=nums[i];
                nums[i]=temp;
                findans(ans,nums,start+1);
                nums[i]=nums[start];
                nums[start]=temp;
            }
        }

    }
}
