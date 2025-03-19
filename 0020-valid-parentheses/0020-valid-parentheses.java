class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() <= 1) {
            return false;
        }

        Map<Character, Character> bracketMap = Map.of(')', '(', '}', '{', ']', '[');
        Stack<Character> stack = new Stack();
        for(char c : s.toCharArray()) {
            if (bracketMap.containsValue(c)) {
                stack.add(c);
                continue;
            }
            if (stack.isEmpty() 
                    || (bracketMap.containsKey(c) && bracketMap.get(c) != stack.pop())) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}