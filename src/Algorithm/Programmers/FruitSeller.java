/*
https://school.programmers.co.kr/learn/courses/30/lessons/135808
 */

package Algorithm.Programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FruitSeller {
    public int solution(int k, int m, int[] score) {
        if (score.length < m) {
            return 0;
        }

        int answer = 0;
        Integer[] scores = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(scores, Collections.reverseOrder());

        int i = 0;
        while (i <= scores.length - m) {
            answer += scores[i + m - 1] * m;
            i += m;
        }
        return answer;
    }

    public int solutionTwo(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for (int i = score.length - 1 ; i >= m - 1; i -= m) {
            answer += score[i - m + 1] * m;
        }
        return answer;
    }

    public int solutionThree(int k, int m, int[] score) {
        if (score.length < m) {
            return 0;
        }

        int numSaleFruit = m * (score.length / m);

        List<Integer> collect = Arrays.stream(score)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(numSaleFruit)
                .collect(Collectors.toList());

        return IntStream.range(0, collect.size())
                .filter(i -> i % m == m - 1)
                .map(collect::get)
                .reduce(Integer::sum)
                .getAsInt() * m;
    }
}
