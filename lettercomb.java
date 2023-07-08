class Solution {
    static String[] arr = {".", ",", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
        {
            List<String> nn = new ArrayList<>();
            return nn;
        }
        return findans(digits);
    }
    public static List<String> findans(String digit)
    {
        if (digit.length() == 0) {
            List<String> nn = new ArrayList<>();
            nn.add("");
            return nn;
        }

        char ch = digit.charAt(0);
        int ind = Character.getNumericValue(ch); 
        String ros = digit.substring(1);
        List<String> bans = findans(ros);
        List<String> finalans = new ArrayList<>();
        String codefordig = arr[ind];
        
        for (int i = 0; i < codefordig.length(); i++) {
            char digitChar = codefordig.charAt(i);
            for (int j = 0; j < bans.size(); j++) {
                finalans.add(digitChar + bans.get(j));
            }
        }

        return finalans;
    }
    
}
