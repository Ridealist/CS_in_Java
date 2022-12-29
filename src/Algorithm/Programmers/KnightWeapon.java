/*
https://school.programmers.co.kr/learn/courses/30/lessons/136798
 */

package Algorithm.Programmers;

public class KnightWeapon {
    public static int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i ++) {
            int sub = countSub(i);
            if (sub > limit) {
                answer += power;
            } else {
                answer += sub;
            }
        }
        return answer;
    }

    private static int countSub(int number) {
        if (number == 1) {
            return 1;
        }
        int count = 2;
        int route = (int) Math.sqrt(number);
        for (int i = 2; i <= route; i++) {
            if (number % i == 0) {
                if (i * i == number) {
                    count += 1;
                    continue;
                }
                count += 2;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(5,3,2));
    }
}
