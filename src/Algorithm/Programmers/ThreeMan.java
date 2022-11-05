/*
https://school.programmers.co.kr/learn/courses/30/lessons/131705
 */

package Algorithm.Programmers;

public class ThreeMan {
    public int solution(int[] number) {
        int l = number.length;
        int answer = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                for (int k = j + 1; k < l; k++) {
                    int sum = number[i] + number[j] + number[k];
                    if (sum == 0) {
                        // answer += 1과 같은 표현
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
