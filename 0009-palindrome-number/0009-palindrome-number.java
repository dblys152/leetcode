class Solution {
    public boolean isPalindrome(int x) {
        String xString = String.valueOf(x);
        return xString.charAt(0) == xString.charAt(xString.length()-1);
    }
}