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
            /*
            // 중복 로직 제거 refactoring
            if (counter.containsKey(ch)) {
                answer[i] = i - counter.get(ch);
            } else {
                answer[i] = -1;
            }
            counter.put(ch, i);

            -> getOrDefault 의 아이디어 유추 가능!
             */
        }
        return answer;
    }

    // 다른 사람 풀이 공부
    public int[] solutionTwo(String s) {
        int[] answer = new int[s.length()];

        Map<Character, Integer> counter = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            answer[i] = i - counter.getOrDefault(ch, (i + 1));
            counter.put(ch, i);
        }
        return answer;
    }
}
