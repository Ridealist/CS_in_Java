/*
https://school.programmers.co.kr/learn/courses/30/lessons/138477
 */

package Algorithm.Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class HonorOfFame {
    // 처음 풀이
    public int[] solution(int k, int[] score) {
        List<Integer> fame = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();

        int i = 0;
        while (i < score.length) {
            if (fame.size() < k) {
                fame.add(score[i]);
            } else {
                if (fame.get(0) < score[i]) {
                    fame.remove(0);
                    fame.add(score[i]);
                }
            }
            Collections.sort(fame);
            answer.add(fame.get(0));
            i++;
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    // 리팩터링 풀이
    public int[] solutionTwo(int k, int[] score) {
        List<Integer> fame = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();

        for (int number : score) {
            if (fame.size() < k) {
                fame.add(number);
            } else {
                if (fame.get(0) < number) {
                    fame.remove(0);
                    fame.add(number);
                }
            }
            Collections.sort(fame);
            answer.add(fame.get(0));
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    // 우선순위 Queue 활용!
    // TODO 다른 사람 풀이공부
    public int[] solutionThree(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            queue.add(score[i]);
            if (queue.size() > k) {
                queue.poll();
            }
            answer[i] = queue.peek();
        }

        return answer;
    }
}
