/*
https://school.programmers.co.kr/learn/courses/30/lessons/12941?language=java
 */

package Algorithm.Programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MakeMin {

    public int solution(int[] A, int[] B)
    {
        int answer = 0;
        // stream 변환_1
//        int[] sorted_A = Arrays.stream(A).sorted().toArray();
//        int[] reverse_sorted_B = Arrays.stream(B).map(i -> -i).sorted().map(i -> -i).toArray();
//        for (int i = 0; i < A.length; i++) {
//            answer += sorted_A[i] * reverse_sorted_B[i];
//        }
        // stream 변환_2
//        List<Integer> a = Arrays.stream(A).boxed().sorted().collect(Collectors.toList());
//        List<Integer> b = Arrays.stream(B).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//
//        for (int i = 0; i < A.length; i++) {
//            answer += a.get(i) * b.get(i);
//        }
        // Arrays wrapper 클래스 활용
        Arrays.sort(A);
        Arrays.sort(B);
        int l = A.length;
        for (int i = 0; i < l; i++) {
            answer += A[i] * B[l - 1 - i];
        }
        return answer;
    }
}
