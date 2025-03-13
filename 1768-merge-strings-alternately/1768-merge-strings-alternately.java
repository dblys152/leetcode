class Solution {
    public String mergeAlternately(String word1, String word2) {
        int word1Len = word1.length();
        int word2Len = word2.length();
        return IntStream.range(0, Math.max(word1Len, word2Len))
            .mapToObj(i -> {
                return (word1Len > i ? String.valueOf(word1.charAt(i)) : "") +
                    (word2Len > i ? String.valueOf(word2.charAt(i)) : "");
            })
            .collect(Collectors.joining());
    }
}