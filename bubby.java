class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        
        int i1 = 0;
        int i2 = 0;
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (count < 1 && s.charAt(i) != goal.charAt(i)) {
                i1 = i;
                count++;
            } else if (count < 2 && s.charAt(i) != goal.charAt(i)) {
                i2 = i;
                count++;
            }
        }
        
        if (count != 2) {
            return count == 0 && hasDuplicateCharacters(s);
        }
        
        char[] ss = s.toCharArray();
        char temp = ss[i1];
        ss[i1] = ss[i2];
        ss[i2] = temp;
        
        for (int i = 0; i < ss.length; i++) {
            if (ss[i] != goal.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean hasDuplicateCharacters(String s) {
        Set<Character> charSet = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!charSet.add(c)) {
                return true;
            }
        }
        return false;
    }
}
