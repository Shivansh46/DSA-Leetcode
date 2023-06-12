import java.util.*;
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        
        List<List<Integer>> ans=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int ele:nums){
             hm.put(ele,hm.getOrDefault(ele,0)+1);
        }
        while(!hm.isEmpty())
        {
            List<Integer> use=new ArrayList<>();
             Set<Integer> a = new HashSet<>(hm.keySet());
            for(int ele : a)
            {
                if(hm.containsKey(ele))
                {
                    
                    if(hm.get(ele)>=1)
                    {
                        use.add(ele);
                        hm.put(ele,hm.get(ele)-1);
                    }
                }
                if(hm.get(ele)==0)
                {
                    hm.remove(ele);
                }
            }
            ans.add(use);
        }
        return ans;

    }
}