class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Deque<Character> stack = new ArrayDeque<>();
        int counter = 0; 
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                counter++;
            } else if (c == ')' && !stack.isEmpty()) {
                if (stack.pop() != '(') {
                    return false;
                }
            } else if (c == '}' && !stack.isEmpty()) {
                if (stack.pop() != '{') {
                    return false;
                }
            } else if (c == ']' && !stack.isEmpty()) {
                if (stack.pop() != '[') {
                    return false;
                }
            }

            if (stack.isEmpty() && counter == 0) {
                return false;
            }
        }

        if (!stack.isEmpty()) {
            return false;
        }
        
        return true;
    }
}
