class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList <Integer> rowposition=new ArrayList<>();
        ArrayList <Integer> columnpostition=new ArrayList<>();

        for(int row=0;row<matrix.length;row++)
        {
            for(int column=0;column<matrix[0].length;column++)
            {
                if(matrix[row][column]==0)
                {
                    rowposition.add(row);
                    columnpostition.add(column);
                    
                }
            }
        }

        for(int elements : rowposition)
        {
            for(int i=0;i<matrix[0].length;i++)
            {
                matrix[elements][i]=0;
            }
        }
        for(int elements: columnpostition)
        {
            for(int i=0;i<matrix.length;i++)
            {
                matrix[i][elements]=0;
            }
        }

     }

}
