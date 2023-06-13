class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
        for(int i=0;i<t.length();i++)
        {
            char b=t.charAt(i);
            if(hm.get(b)!=null)//hm.containsKey(b)
            {
                if(hm.get(b)==1)
                {
                    hm.remove(b);
                }
                else
                {
                    hm.put(b,hm.getOrDefault(b,0)-1);
                }
            }
        }
        return hm.isEmpty()?true:false;
    }
}