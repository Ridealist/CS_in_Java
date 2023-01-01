/*
https://school.programmers.co.kr/learn/courses/30/lessons/131128
 */

package Algorithm.Programmers;

public class NumberPair {
    public String solution(String X, String Y) {
        int[] countX = new int[10];
        int[] countY = new int[10];

        for (int i = 0; i < X.length(); i++) {
            int num = Integer.parseInt(X.substring(i, i + 1));
            countX[num]++;
        }

        for (int j = 0; j < Y.length(); j++) {
            int num = Integer.parseInt(Y.substring(j, j + 1));
            countY[num]++;
        }

        StringBuilder str = new StringBuilder();
        for (int z = 9; z >= 1; z--) {
            str.append(String.valueOf(z).repeat(Math.min(countX[z], countY[z])));
        }

        if (str.toString().equals("")) {
            if (countX[0] != 0 && countY[0] != 0) {
                return "0";
            }
            return "-1";
        }
        str.append(String.valueOf(0).repeat(Math.min(countX[0], countY[0])));
        return str.toString();
    }
}
