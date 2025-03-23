class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        } 

        int startIndex = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int loofSize = s.length();
        for (int i = 0; i < loofSize; i++) {
            char c = s.charAt(i);
            if (charIndexMap.containsKey(c) 
                    && charIndexMap.get(c) >= startIndex) {
                startIndex = charIndexMap.get(c) + 1;
            }

            maxLength = Math.max(maxLength, i - startIndex + 1);

            charIndexMap.put(c, i);
        }

        return maxLength == 0 ? loofSize : maxLength;
    }
}