class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for(int i=0;i<grid.length;i++)
        {
            Arrays.sort(grid[i]);
        }
        int ans=0;
        
        int ind=grid[0].length-1;
        for(int i=0;i<grid[0].length;i++)
        {
            int ad=0;
            for(int j=0;j<grid.length;j++)
            {
                ad=Math.max(ad,grid[j][ind]);
                
            }
            ans+=ad;
            ind--;
        }
        return ans;
    }
}