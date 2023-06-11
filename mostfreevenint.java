import java.util.*;
class mostfreevenint {
    public int mostFrequentEven(int[] nums) {
         TreeMap<Integer,Integer> tm=new TreeMap<>();
         for(int i=0;i<nums.length;i++)
         {
             int a=nums[i];
             if(a%2==0)
             {
                 if(tm.containsKey(a))
                 {
                     tm.put(a,tm.get(a)+1);
                 }
                 else
                 {
                     tm.put(a,1);
                 }
             }
         }
         int max=0;
         int ans=0;
         for(int a:tm.keySet())
         {
             if(tm.get(a)>max)
             {
                 ans=a;
                 max=tm.get(a);
             } 
         }
         return tm.size()==0?-1:ans;
      
         
    }
}