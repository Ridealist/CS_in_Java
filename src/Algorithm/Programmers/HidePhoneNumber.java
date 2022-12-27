/*
https://school.programmers.co.kr/learn/courses/30/lessons/12948
 */

package Algorithm.Programmers;

public class HidePhoneNumber {
    public String solution(String phone_number) {
        StringBuilder str = new StringBuilder();
        int length = phone_number.length();
        str.append("*".repeat(length - 4));
        str.append(phone_number.substring(length - 4));
        return str.toString();
    }

    public String solutionTwo(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for (int i = 0; i < phone_number.length() - 4; i++) {
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }
}
