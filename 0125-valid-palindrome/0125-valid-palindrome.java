class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase()
                .replaceAll("[^a-zA-Z0-9]", "");
        if (s.equals("")) {
            return true;
        }

        int sLength = s.length();
        int findSize = sLength / 2;
        for (int i = 0; i < findSize; i++) {
            if (s.charAt(i) != s.charAt(sLength - i - 1)) {
                return false;
            }
        }

        return true;
    }
}