/*
https://school.programmers.co.kr/learn/courses/30/lessons/70129?language=java
 */

package Algorithm.Programmers;

public class RepeatBinaryTrans {

    int zeroCount = 0;
    int transCount = 0;

    public int[] solution(String s) {
        while (!s.equals("1")) {
            s = toBinary(deleteZero(s));
            transCount++;
        }
        return new int[]{transCount, zeroCount};
    }

    public String deleteZero(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                str.append(s.charAt(i));
            }
            else {
                zeroCount++;
            }
        }
        return str.toString();
    }

//    public String toBinary(String s) {
//        return Integer.toBinaryString(s.length());
//    }

    public String toBinary(String s) {
        int l = s.length();
        StringBuilder str = new StringBuilder();
        while (l > 0) {
            str.append(l % 2);
            l = l / 2;
        }
        return str.reverse().toString();
    }
}
