class Solution {
    Set<List<Integer>> res = new HashSet<>();
    
    void solve(int [] nums,int n,int idx,List<Integer>temp)
    {
        if(idx==n)
        {
            res.add(new ArrayList(temp));
            return ;
        }
        solve(nums,n,idx+1,temp);
        temp.add(nums[idx]);
        solve(nums,n,idx+1,temp);
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        solve(nums,n,0,new ArrayList());
        return new ArrayList(res);
        
    }
}
