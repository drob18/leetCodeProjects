class Solution {

  /* Checking if the given string has a valid set of parenthesis using a stack */
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else if (s.charAt(i) == '}') {
                if (!st.empty() && st.peek() == '{') {
                    st.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == ')') {
                if (!st.empty() && st.peek() == '(') {
                    st.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == ']') {
                if (!st.empty() && st.peek() == '[') {
                    st.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        if (st.empty()) {
            return true;
        } else {
            return false;
        }
    }
        
}
