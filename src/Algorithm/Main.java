package Algorithm;

import Algorithm.Programmers.PrimeCountInkRadix;

public class Main {
    public static void main(String[] args) {
        PrimeCountInkRadix primeCountInkRadix = new PrimeCountInkRadix();
        int answer = primeCountInkRadix.solution(34151312, 3);
        System.out.println(answer);
    }
}