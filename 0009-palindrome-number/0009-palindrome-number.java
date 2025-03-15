class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }

        String xStr = String.valueOf(x);
        int xStrLength = xStr.length();
 
        int loopLength = xStrLength / 2;
        for(int i = 0; i < loopLength; i++) {
            if (xStr.charAt(i) != xStr.charAt(xStrLength - i - 1)) {
                return false;
            }
        }
        return true;
    }
}