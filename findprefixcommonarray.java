class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int ans[]=new int[A.length];
        int ind=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int putcount=0;
        for(int i=0;i<ans.length;i++)
        {
            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
            if(hm.get(A[i])==2)
            {
                putcount+=1;
            }
            hm.put(B[i],hm.getOrDefault(B[i],0)+1);
            if(hm.get(B[i])==2)
            {
                putcount+=1;
            }
            ans[ind++]=putcount;
        }
        return ans;
    }
}
