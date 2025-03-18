class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineCharMap = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            magazineCharMap.merge(c, 1, Integer::sum);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!magazineCharMap.containsKey(c) || magazineCharMap.get(c) == 0) {
                return false;
            }
            magazineCharMap.put(c, magazineCharMap.get(c) - 1);
        }

        return true;
    }
}