class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }
        for (char c : t.toCharArray()) {
            map2.merge(c, 1, Integer::sum);
        }
        
        return map.entrySet().stream()
            .allMatch(entry -> Objects.equals(entry.getValue(), map2.get(entry.getKey())));
    }
}