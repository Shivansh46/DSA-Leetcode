class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        for(int e:nums)
        {
            hm.put(e,hm.getOrDefault(e,0)+1);
            int val=hm.get(e);
            if(val>(n/2))
            {
                return e;
            }
        }
        return 0;


    }
}
