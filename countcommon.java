class Solution {
    public int countWords(String[] words1, String[] words2) {
        
        Map<String, Integer> map = new HashMap<>();
        for(String word : words1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for(String word : words2) {
            
            Integer freq = map.get(word);             
            if(freq != null && freq <= 1) {
                map.put(word, freq - 1);
            }
        }
        
        int count = 0;
        for(int val : map.values()) {
            if(val == 0) {
                ++count;
            }
        }
        
        return count;
    }
}