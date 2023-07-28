class Solution {
    public int cherryPickup(int[][] grid) {
        int dp[][][]=new int[grid.length+1][grid[0].length+1][grid[0].length+1];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                for(int k=0;k<grid[0].length;k++)
                {
                    dp[i][j][k]=-1;
                }
            }
        }
        return findans(grid,0,0,grid[0].length-1,dp);
    }
    public static int findans(int [][]grid, int i,int j1,int j2,int dp[][][])
    {
        
        if(j1<0 || j2<0  || j1>=grid[0].length || j2>=grid[0].length)
        {
            return (int)-1e9;
        }
        if(i==grid.length-1)
        {
            if(j1==j2)
            {
                return grid[i][j1];
            }
            else
            {
                return grid[i][j1]+grid[i][j2];
            }
        }
        if(dp[i][j1][j2]!=-1)
        {
            return dp[i][j1][j2];
        }
        int ans=(int)-1e9;
        for(int alice=-1;alice<=1;alice++)
        {
            for(int bob=-1;bob<=1;bob++)
            {
                if(j1==j2)
                {
                    ans=Math.max(ans,grid[i][j1]+findans(grid,i+1,j1+alice,j2+bob,dp));
                }
                else
                {
                    ans=Math.max(ans,grid[i][j1]+grid[i][j2]+findans(grid,i+1,j1+alice,j2+bob,dp));
                }
            }
        }
        return dp[i][j1][j2]=ans;
    }
}
