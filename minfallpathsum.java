class Solution {
    public int minFallingPathSum(int[][] matrix) {

        int dp[][]=new int[matrix.length][matrix[0].length];
        for (int j = 0; j < matrix[0].length; j++) {
            dp[0][j] = matrix[0][j];
        }
        
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                int left = (j > 0) ? matrix[i][j] + dp[i - 1][j - 1]:(int)1e9;
                int up = matrix[i][j] + dp[i - 1][j];
                int right = (j < matrix[0].length - 1) ? matrix[i][j] + dp[i - 1][j + 1]: (int)1e9 ;
                dp[i][j] = Math.min(left, Math.min(up, right));
            }
        }
        int minPathSum = Integer.MAX_VALUE;
        for (int j = 0; j < matrix[0].length; j++) {
            minPathSum = Math.min(minPathSum, dp[matrix.length - 1][j]);
        }
        
        return minPathSum;
    }
}

/*
for(int temp[]:dp)
        {
            Arrays.fill(temp,-1);
        }
        for(int i=0;i<matrix[0].length;i++)
        {
            a=Math.min(a,findans(matrix,0,i,dp));
        }
        return a;
    }
    public static int findans(int mat[][],int i,int j,int dp[][])
    {
        if(i>=mat.length || j >=mat[0].length || j<0)
        {
            return (int)1e9;
        }
        if(i==mat.length-1 && j>=0)
        {
            return mat[i][j];
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
            
        int ans=Integer.MAX_VALUE;
        int left=mat[i][j]+findans(mat,i+1,j-1,dp);
        int down=mat[i][j]+findans(mat,i+1,j,dp);
        int right=mat[i][j]+findans(mat,i+1,j+1,dp);
        ans=Math.min(left,Math.min(down,right));        
        return dp[i][j]=ans;

    */
