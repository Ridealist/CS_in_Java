/*
https://school.programmers.co.kr/learn/courses/30/lessons/133502?language=java
 */

package Algorithm.Programmers;

import java.util.ArrayList;
import java.util.List;

public class MakeHamburger {

    int count = 0;
    boolean flag = false;

    public int solution(int[] ingredient) {
        List<Integer> ingredientList = new ArrayList<>();
        for (int i : ingredient) {
            ingredientList.add(i);
            System.out.println();
        }

        do {
            flag = false;
            ingredientList = exceptHamburger(ingredientList);
        } while (flag);

        return count;
    }

    public List<Integer> exceptHamburger(List<Integer> ingredientList) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < ingredientList.size() - 3; i++) {
            if (ingredientList.get(i) == 1) {
                if (ingredientList.get(i + 1) == 2) {
                    if (ingredientList.get(i + 2) == 3) {
                        if (ingredientList.get(i + 3) == 1) {
                            count += 1;
                            flag = true;
                            i += 4;
                        }
                    }
                }
            }
            newList.add(ingredientList.get(i));
        }
        return newList;
    }
}
