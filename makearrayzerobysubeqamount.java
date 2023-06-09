import java.util.*;
class makearrayzerobysubeqamount {
    public int minimumOperations(int[] nums) {
        PriorityQueue <Integer> pq=new PriorityQueue<>();
        for(int elements:nums)
        {
            if(elements!=0)
            {
                pq.add(elements);
            }
        }
        int ans=0;
        int sum=0;
        while(!pq.isEmpty())
        {
            if(sum<pq.peek())
            {
                ans+=1;
                sum+=pq.poll()-sum;
            }
            else
            {
                pq.poll();
            }
        }
        return ans;
    }
}
