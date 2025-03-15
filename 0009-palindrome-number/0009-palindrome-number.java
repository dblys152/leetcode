class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        String xStr = String.valueOf(x);
        int xStrLength = xStr.length();
        if (xStrLength == 1) {
            return true;
        }

        int loopLength = xStrLength / 2;
        for(int i = 0; i < loopLength; i++) {
            if (xStr.charAt(i) != xStr.charAt(xStrLength - i - 1)) {
                return false;
            }
        }
        return true;
    }
}