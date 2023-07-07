class Solution {
    public boolean lemonadeChange(int[] bills) {
        int arr[]=new int[3];
        
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
            {
                arr[0]+=1;
            }
            if(bills[i]==10)
            {
                arr[1]+=1;
                if(arr[0]>0)
                {
                    arr[0]-=1;
                }
                else
                {
                    return false;
                }
            }
            if(bills[i]==20)
            {
                if(arr[1]>0)
                {
                    arr[1]-=1;
                    if(arr[0]>0)
                    {
                        arr[0]-=1;
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    if(arr[0]>=3)
                    {
                        arr[0]-=3;
                    }
                    else
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
