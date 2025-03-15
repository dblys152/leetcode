class Solution {
    public boolean isPalindrome(int x) {
        String xStr = String.valueOf(x);
        int xStrLength = xStr.length();
        if (xStrLength == 1) {
            return true;
        }
        if (xStr.charAt(0) == '-') {
            return false;
        }

        for(int i = 0; i < xStrLength / 2; i++) {
            if (xStr.charAt(i) != xStr.charAt(xStrLength - (i+1))) {
                return false;
            }
        }
        return true;
    }
}