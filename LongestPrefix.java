class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String start = strs[0];
        String end = "";
        int min = 200;
        for (String s2: strs) {
            if (start.length() < s2.length()) {
                min = start.length();
            } else {
                min = s2.length();
            }
            for (int i = 0; i < min; i++) {
                if (s2.charAt(i) == start.charAt(i)) {
                    end += s2.charAt(i);
                } else {
                    break;
                }   
            }
            start = end;
            end = "";
        }
        return start;
    }
}
