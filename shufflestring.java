class shufflestring {
    public String restoreString(String s, int[] indices) {
        char arr[]=new char[s.length()];
        for(int i=0;i<indices.length;i++)
        {
            arr[indices[i]]=s.charAt(i);
        }
        String ans="";
        for(char a:arr)
        {
            ans+=a;
        }
        return ans;
    }
}