/*
https://school.programmers.co.kr/learn/courses/30/lessons/133499
 */

package Algorithm.Programmers;

import java.util.Arrays;
import java.util.List;

public class BabyWord {
    private int count = 0;
    private final List<String> babblings = Arrays.asList("aya", "ye", "woo", "ma");

    public int solution(String[] babbling) {
        for (String babs : babbling) {
            findBabbling(babs);
        }
        return count;
    }

    public void findBabbling(String bab) {
        int start = 0;
        String previous = "";
        StringBuilder builder = new StringBuilder();
        for (int i = 2; i <= bab.length(); i++) {
            String split = bab.substring(start, i);
            if (babblings.contains(split)) {
                if (previous.equals(split)) {
                    break;
                }
                builder.append(split);
                previous = split;
                start = i;
            }
        }
        if (builder.toString().equals(bab)) {
            count++;
        }
    }

    public int solutionTwo(String[] babbling) {
        int answer = 0;
        for (String string : babbling) {
            if (string.contains("ayaaya") || string.contains("yeye") || string.contains("woowoo")
                    || string.contains("mama")) {
                continue;
            }
            string = string.replace("aya", " ");
            string = string.replace("ye", " ");
            string = string.replace("woo", " ");
            string = string.replace("ma", " ");
            // 빈칸 없이 replace 할 경우 : (aayaya) -> aya -> "" || 빈칸 있게 : (aayaya) -> a ya
            string = string.replace(" ", "");

            if (string.equals("")) {
                answer++;
            }
        }
        return answer;
    }
}
