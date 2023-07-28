class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int ans=1;  //kyuki first lenge hi lenge
        int lastend=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(lastend<=intervals[i][0])
            {
                lastend=intervals[i][1];
                ans+=1; //yaha nikal liya ki kitne bann sakte hai 
            }
        }
        return intervals.length-ans;// yaha seh nikal liya ki kitne nahi bann sakte hai 
    }
}
