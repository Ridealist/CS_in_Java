package Algorithm.Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HonorOfFame {
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
}
