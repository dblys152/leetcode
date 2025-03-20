class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        int loofSize = s.length();
        for (int i = 0; i < loofSize; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (map.containsKey(sChar) && map.get(sChar) != tChar
                    || !map.containsKey(sChar) && map.containsValue(tChar)) {
                return false;
            }

            map.put(sChar, tChar);
        }
        return true;
    }
}