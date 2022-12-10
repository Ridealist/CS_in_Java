/*
https://school.programmers.co.kr/learn/courses/30/lessons/12911
 */

package Algorithm.Programmers;

// 정확성 통과! - 효율성 다 통과 못함...ㅠㅠ
public class NextBigNum {

    public static void main(String[] args) {
        String bin = "10010101110";
        System.out.println(bin.substring(0, findZeroOne(bin) + 2));
    }

    public static int solution(int n) {
        StringBuilder str = new StringBuilder();
        String bin = makeBinary(n);
        if (findZeroOne(bin) == -1) {
            int oneCount = count(bin, '1');
            int zeroCount = count(bin, '0');
            str.append("10");
            str.append("0".repeat(zeroCount));
            str.append("1".repeat(oneCount - 1));
            return binToDec(str.toString());
        }
        int idx = findZeroOne(bin);
        int zeroCount = count(bin.substring(idx + 2), '0');
        int oneCount = count(bin.substring(idx + 2), '1');
        str.append(bin, 0, idx);
        str.append("10");
        str.append("0".repeat(zeroCount));
        str.append("1".repeat(oneCount));
        return binToDec(str.toString());
    }

    public static int count(String bin, char ch) {
        return (int) bin.chars()
                .filter(c -> c == ch)
                .count();
    }

    public static int findZeroOne(String bin) {
        return bin.lastIndexOf("01");
    }

    public static String makeBinary(int number) {
        StringBuilder str = new StringBuilder();
        while (number > 0) {
            str.append(number % 2);
            number = number / 2;
        }
        return str.reverse().toString();
    }

    public static int binToDec(String bin) {
        int result = 0;
        int l = bin.length();
        for (int i = 0; i < l; i++) {
            result += Integer.parseInt(bin.substring(i, i+1)) * Math.pow(2, l - 1 - i);
        }
        return result;
    }
}

class NextBigNum2 {

    public static void main(String[] args) {
        String bin = "10010101110";
        System.out.println(Integer.toBinaryString(20));
        System.out.println(Integer.parseInt("10100", 2));
    }

    public static int solution(int n) {
        StringBuilder str = new StringBuilder();
        String bin = Integer.toBinaryString(n);
        if (bin.lastIndexOf("01") == -1) {
            int oneCount = count(bin, '1');
            int zeroCount = count(bin, '0');
            str.append("10");
            str.append("0".repeat(zeroCount));
            str.append("1".repeat(oneCount - 1));
            return Integer.parseInt(str.toString(), 2);
        }
        int idx = bin.lastIndexOf("01");
        int zeroCount = count(bin.substring(idx + 2), '0');
        int oneCount = count(bin.substring(idx + 2), '1');
        str.append(bin, 0, idx);
        str.append("10");
        str.append("0".repeat(zeroCount));
        str.append("1".repeat(oneCount));
        return Integer.parseInt(str.toString(), 2);
    }

    public static int count(String bin, char ch) {
        return (int) bin.chars()
                .filter(c -> c == ch)
                .count();
    }
}
