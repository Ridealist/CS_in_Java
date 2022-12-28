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
}
