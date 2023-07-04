class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        findans(n,k,ans,new ArrayList<>(),1);
        return ans;
    }
    public static void findans(int n,int k,List<List<Integer>> ans,List<Integer> ds,int ind)
    {
        if(k==0)
        {
            ans.add(new ArrayList<>(ds));
            return ;
        }
        for(int i=ind;i<=n;i++)
        {
            ds.add(i);
            findans(n,k-1,ans,ds,i+1);
            ds.remove(ds.size()-1);
        }
    }
}
