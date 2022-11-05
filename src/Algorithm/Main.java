package Algorithm;

import Algorithm.Programmers.PrimeInkRadix;

public class Main {
    public static void main(String[] args) {
        PrimeInkRadix primeInkRadix = new PrimeInkRadix();
        int answer = primeInkRadix.solution(34151312, 3);
        System.out.println(answer);
    }
}