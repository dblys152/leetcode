class Solution {
    public boolean wordPattern(String pattern, String s) {
        int loofSize = pattern.length();
        String[] sArr = s.split(" ");
        if (loofSize != sArr.length) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < loofSize; i++) {
            char c = pattern.charAt(i);
            String word = sArr[i];
            if (map.containsKey(c) && !map.get(c).equals(word)
                    || !map.containsKey(c) && map.containsValue(word)) {
                return false;
            }
            map.put(c, word);
        }

        return true;
    }
}