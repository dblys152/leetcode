class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        if (sLength > tLength) {
            return false;
        }
        
        int sIndex = 0; 
        int tIndex = 0;
        while(sIndex < sLength && tIndex < tLength) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            tIndex++;
        }

        return sIndex == sLength;
    }
}