class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        findans(0,ans,candidates,target,new ArrayList<>());
        return ans;
    }
    public static void findans(int ind,List<List<Integer>> ans, int [] candidates,int target,List<Integer> addd)
    {
        if(candidates.length==ind)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(addd));
            }
            return ;
        }
        if(candidates[ind]<=target)
        {
            addd.add(candidates[ind]);
            findans(ind,ans,candidates,target-candidates[ind],addd);
            addd.remove(addd.size()-1);
        }
        findans(ind+1,ans,candidates,target,addd);
    }
}
