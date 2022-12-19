/*
https://school.programmers.co.kr/learn/courses/30/lessons/12969?language=java
 */

package Algorithm.Programmers;

import java.util.Scanner;
import java.util.stream.IntStream;

public class RectangleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            System.out.println("*".repeat(a));
        }
    }

    public static void mainTwo(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        IntStream.range(0, a).forEach(s -> sb.append("*"));
        IntStream.range(0, b).forEach(s -> System.out.println(sb));
    }
}
