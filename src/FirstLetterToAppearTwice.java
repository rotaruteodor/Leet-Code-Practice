// https://leetcode.com/problems/first-letter-to-appear-twice

public class FirstLetterToAppearTwice {

    static public char repeatedCharacter(String s) {
        boolean[] charsExistences = new boolean[26];
        for (Character c : s.toCharArray()) {
            if (charsExistences[c-'a']) {
                return c;
            } else {
                charsExistences[c-'a'] = true;
            }
        }
        return '-';
    }

}
