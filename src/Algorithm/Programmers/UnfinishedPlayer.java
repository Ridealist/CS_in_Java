/*
https://school.programmers.co.kr/learn/courses/30/lessons/42576
 */

package Algorithm.Programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UnfinishedPlayer {
    // 처음 풀이 : 시간복잡도 O(3n)
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> players = new HashMap<>();
        for (String player : participant) {
            players.put(player, players.getOrDefault(player, 0) + 1);
        }

        for (String player : completion) {
            players.put(player, players.get(player) - 1);
        }

        /*
        keySet하고 또 get하는 건 매우 비효율적인 코드입니다.
        get할 때마다 계속 HashMap을 search하니까요.
        key, value를 같이 가져올 때는 항상 entrySet을 사용해야 해요.
         */

//        for (String player : players.keySet()) {
//            if (players.get(player) != 0) {
//                return player;
//            }
//        }

        for (Map.Entry<String, Integer> entry : players.entrySet()) {
            if (entry.getValue() != 0) {
                return entry.getKey();
            }
        }

        return "";
    }

    // 풀이 refactoring : 시간 복잡도 O(2n)
    public String solutionRefactor(String[] participant, String[] completion) {
        Map<String, Integer> players = new HashMap<>();
        for (String player : participant) {
            players.put(player, players.getOrDefault(player, 0) + 1);
        }

        for (String player : completion) {
            players.put(player, players.get(player) - 1);
            if (players.get(player) == 0) {
                players.remove(player);
            }
        }

        return players.keySet().toArray(String[]::new)[0];
        // return players.keySet().iterator().next() -> iterable 을 만들어 반환 가능
    }

    // 다른 풀이 : 시간 복잡도 O(2nlogn)
    public String solutionTwo(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[participant.length - 1];
    }
}
