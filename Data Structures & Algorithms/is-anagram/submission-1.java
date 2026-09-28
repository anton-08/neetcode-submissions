class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> string1 = new HashMap<>();
        Map<Character, Integer> string2 = new HashMap<>();
        for (int i = 0; i < s1.length; i++) {
            if (!string1.containsKey(s1[i])) {
                string1.put(s1[i], 1);
            } else {
                int x = string1.get(s1[i]);
                x += 1;
                string1.put(s1[i], x);
            }
        }

        for (int i = 0; i < s2.length; i++) {
            if (!string2.containsKey(s2[i])) {
                string2.put(s2[i], 1);
            } else {
                int x = string2.get(s2[i]);
                x += 1;
                string2.put(s2[i], x);
            }
        }

        if (string1.equals(string2)) {
            return true;
        } else {
            return false;
        }
    }
}
