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
}
