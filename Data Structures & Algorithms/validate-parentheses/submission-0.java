class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> brackets = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        brackets.put(')', '('); brackets.put('}', '{'); brackets.put(']', '[');

        // Iterate over each character in the string
        for (char c : s.toCharArray()) {
            if (brackets.containsKey(c)) {
                // if closing bracket before open or bracket type mismatch
                if (stack.isEmpty() || stack.peek() != brackets.get(c)) {
                    return false;
                }
                // remove once pair completed
                stack.pop();
            } else stack.push(c); // push opening bracket onto stack
        }
        return stack.isEmpty();
    }
}