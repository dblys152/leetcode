class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        } 

        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int loofSize = s.length();
        for (int start = 0, end = 0; end < loofSize; end++) {
            char c = s.charAt(end);
            if (charIndexMap.containsKey(c) 
                    && charIndexMap.get(c) >= start) {
                start = charIndexMap.get(c) + 1;
            }

            maxLength = Math.max(maxLength, end - start + 1);

            charIndexMap.put(c, end);
        }

        return maxLength == 0 ? loofSize : maxLength;
    }
}