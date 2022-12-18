/*
https://school.programmers.co.kr/learn/courses/30/lessons/86051?language=java
 */

package Algorithm.Programmers;

import java.util.ArrayList;
import java.util.List;

public class NotContainsNumber {
    public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> numberList = new ArrayList<>();
        for (int number : numbers) {
            numberList.add(number);
        }
        List<Integer> zeroToNine = List.of(0,1,2,3,4,5,6,7,8,9);
        for (int i : zeroToNine) {
            if (!numberList.contains(i)) {
                answer += i;
            }
        }
        return answer;
    }

    public int solutionTwo(int[] numbers) {
        int sum = 45;
        for (int number : numbers) {
            sum -= number;
        }
        return sum;
    }
}
