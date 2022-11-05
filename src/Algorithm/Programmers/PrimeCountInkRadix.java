/*
https://school.programmers.co.kr/learn/courses/30/lessons/92335
 */

package Algorithm.Programmers;

public class PrimeCountInkRadix {
    public int solution(int n, int k) {
        String n_k = Integer.toString(n, k);
        String[] array = n_k.split("0");

        int answer = 0;
        for (String arg : array) {
            if (arg.equals("")) { continue; }
            long arg2int = Long.parseLong(arg);
            if (isPrime(arg2int)) {
                answer += 1;
            }
        }
        return answer;
    }

    public boolean isPrime(long n) {
        long bound = (long) Math.sqrt(n);
        if (n == 1) {
            return false;
        }
        int i = 2;
        while (i <= bound + 1 & i < n) {
            if (n % i == 0) {
                return false;
            }
            i += 1;
        }
        return true;
    }
}
