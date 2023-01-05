/*
https://school.programmers.co.kr/learn/courses/30/lessons/142086
 */

package Algorithm.Programmers;

import java.util.HashMap;
import java.util.Map;

public class NearestValue {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        Map<Character, Integer> counter = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (counter.containsKey(ch)) {
                answer[i] = i - counter.get(ch);
                counter.put(ch, i);
                continue;
            }
            answer[i] = -1;
            counter.put(ch, i);
        }
        return answer;
    }
}
