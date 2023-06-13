import java.util.*;
class Solution {
    public int equalPairs(int[][] grid) {
         HashMap<ArrayList,Integer> map1=new HashMap<>();
        for(int i=0;i<grid.length;i++)
        {
                ArrayList<Integer> use1=new ArrayList<>();
            for(int j=0;j<grid[0].length;j++)
            {
                use1.add(grid[i][j]);
            }
            map1.put(use1,map1.getOrDefault(use1,0)+1);
        }
        int ans=0;
        for(int i=0;i<grid.length;i++)
        {
            ArrayList<Integer> use2=new ArrayList<>();
            for(int j=0;j<grid.length;j++)
            {
                use2.add(grid[j][i]);
            }
            if(map1.containsKey(use2))
            {
                ans+=map1.get(use2);
            }
        }
        return ans;
    }
}