class Solution {
    public int minPathSum(int[][] grid) {
        int dp[][]=new int[grid.length+1][grid[0].length+1]; 

        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(i==0 && j==0)
                {
                    dp[i][j]=grid[i][j];
                }
                else
                {
                    int up=Integer.MAX_VALUE;
                    int lef=Integer.MAX_VALUE;
                    if(i>0)
                    {
                        up=grid[i][j]+dp[i-1][j];

                    }
                    if(j>0)
                    {
                       lef=grid[i][j]+dp[i][j-1];
                    }
                    dp[i][j]=Math.min(up,lef);
                }
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }
}

/*
MEMO

int dp[][]=new int[grid.length+1][grid[0].length+1]; 
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        return findans(grid,grid.length-1,grid[0].length-1,dp);
    }
    public static int findans(int grid[][],int i,int j,int dp[][])
    {
        if(i==0 && j==0)
        {
            return grid[i][j];
        }
        if(i<0 || j<0)
        {
            return (int)1e9;
            //taaki yeh wala min pehle hi hata de
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int up=grid[i][j]+findans(grid,i-1,j,dp);
        int left=grid[i][j]+findans(grid,i,j-1,dp);
        //yaha hum log neeche seh upar solve karr rahe hai 
        return dp[i][j]=Math.min(left,up);
        */
