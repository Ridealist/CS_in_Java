/*
https://school.programmers.co.kr/learn/courses/30/lessons/12918
 */

package Algorithm.Programmers;

public class ManipulateString {
    public boolean solution(String s) {
        int l = s.length();
        if (l == 4 || l == 6) {
            for (int i = 0; i < l; i ++) {
                if (!Character.isDigit(s.charAt(i))) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public boolean solutionTwo(String s) {
        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
        return false;
    }
}
