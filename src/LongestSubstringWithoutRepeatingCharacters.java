// https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.HashMap;
// todo: Needs improvement
public class LongestSubstringWithoutRepeatingCharacters {

    static public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxSubstringLength = 0;
        int strLen = s.length();
        HashMap<Character, Integer> currentSubstringChars = new HashMap<>();

        for (int i = 0; i < strLen; i++) {
            if (currentSubstringChars.containsKey(s.charAt(i))) {
                maxSubstringLength = Math.max(maxSubstringLength, currentSubstringChars.size());
                i = currentSubstringChars.get(s.charAt(i));
                currentSubstringChars = new HashMap<>();
            } else {
                currentSubstringChars.put(s.charAt(i), i);
            }
        }
        maxSubstringLength = Math.max(maxSubstringLength, currentSubstringChars.size());
        return maxSubstringLength;
    }
}
