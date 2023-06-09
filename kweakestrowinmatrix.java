import java.util.*;
class kWeakestrowinmatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        int ans[]=new int[k];
        PriorityQueue <int []> pq=new PriorityQueue<>((a,b)-> a[0]!=b[0]? a[0]-b[0]:a[1]-b[1]);
        for(int i=0;i<mat.length;i++)
        {
            int soldier=0;
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                {
                    soldier+=1;
                }
            }
            int putt[]=new int[2];
            putt[0]=soldier;
            putt[1]=i;
            pq.offer(putt);
        } 
        for(int i=0;i<k;i++)
        {
            ans[i]=pq.poll()[1];
        }
        return ans;
    }
}