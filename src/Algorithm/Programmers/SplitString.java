/*
https://school.programmers.co.kr/learn/courses/30/lessons/140108
 */

package Algorithm.Programmers;

import java.util.ArrayList;
import java.util.List;

public class SplitString {
    public int solution(String s) {

        List<String> result = new ArrayList<>();

        int index = 0;
        int countX = 0;
        int countNonX = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(index)) {
                countX++;
            } else {
                countNonX++;
            }

            if (countNonX != 0 && countX == countNonX) {
                result.add(s.substring(index, i));
                index = i + 1;
                index = i + 1;
                countX = 0;
                countNonX = 0;
            } else {
                if (i == s.length() - 1) {
                    return result.size() + 1;
                }
            }
        }
        return result.size();
    }
}
