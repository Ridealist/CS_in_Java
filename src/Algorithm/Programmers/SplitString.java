package Algorithm.Programmers;

public class SplitString {

    private int answer = 0;


    public int solution(String s) {
        if (s.length() == 1) {
            answer++;
            return answer;
        }
        String splitS = makeSplit(s);
        return solution(splitS);
    }

    public String makeSplit(String s) {
        int index = 1;
        int countX = 1;
        int countNonX = 0;
        char x = s.charAt(0);
        while (index < s.length()) {
            if (x == s.charAt(index)) {
                countX++;
            } else {
                countNonX++;
            }
            if (countX == countNonX) {
                break;
            }
            index++;
        }
        if (index == s.length() - 1) {
            return "";
        }
        return s.substring(index + 1);
    }
}
