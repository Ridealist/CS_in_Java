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
                continue;
            }
            answer += sub;
        }
        return answer;
    }

    // 1. 약수의 개수 관점
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

    // 2. 배수 관점
    private static int solutionTwo(int number, int limit, int power) {
        int[] attack = new int[number + 1];
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                attack[i * j]++;
            }
        }
        int answer = 0;
        for (int value : attack) {
            if (value > limit) {
                answer += power;
            } else {
                answer += value;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solutionTwo(10,3,2));
    }
}
