class Solution {
    public int sumOfUnique(int[] nums) {
       
       HashMap<Integer,Integer> hm=new HashMap<>();
       for(int i:nums)
       {
           hm.put(i,hm.getOrDefault(i,0)+1);
       }
       int ans=0;
       Set<Integer> se=hm.keySet();
       for(int i:se)
       {
           if(hm.get(i)==1)
           {
               ans+=i;
           }

       }
       return ans;
    }
}