/*
https://school.programmers.co.kr/learn/courses/30/lessons/42576
 */

package Algorithm.Programmers;

import java.util.HashMap;
import java.util.Map;

public class UnfinishedPlayer {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> players = new HashMap<>();
        for (String player : participant) {
            players.put(player, players.getOrDefault(player, 0) + 1);
        }

        for (String player : completion) {
            players.put(player, players.get(player) - 1);
        }

        for (String player : players.keySet()) {
            if (players.get(player) != 0) {
                return player;
            }
        }
        return "";
    }
}
