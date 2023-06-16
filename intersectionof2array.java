class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h1=new HashSet<>();  
        ArrayList<Integer> ans=new ArrayList<>();     
        for(int i=0;i<nums1.length;i++)
        {
            h1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(h1.contains(nums2[i]))
            {
                ans.add(nums2[i]);
                h1.remove(nums2[i]);
            }
        }
        int ret[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++)
        {
            ret[i]=ans.get(i);
        }
        return ret;
               
    }
}
