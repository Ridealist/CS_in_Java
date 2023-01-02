/*
https://school.programmers.co.kr/learn/courses/30/lessons/135808
 */

package Algorithm.Programmers;

import java.util.Arrays;
import java.util.Collections;

public class FruitSeller {
    public int solution(int k, int m, int[] score) {
        if (score.length < m) {
            return 0;
        }

        int answer = 0;
        Integer[] scores = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(scores, Collections.reverseOrder());

        System.out.println(scores.toString());
        int i = 0;
        while (i <= scores.length - m) {
            System.out.println(answer);
            answer += scores[i + m - 1] * m;
            i += m;
        }
        return answer;
    }
}
