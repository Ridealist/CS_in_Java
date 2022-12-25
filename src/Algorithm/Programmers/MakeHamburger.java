/*
https://school.programmers.co.kr/learn/courses/30/lessons/133502?language=java
 */

package Algorithm.Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

// 올바른 풀이 But, 시간 초과ㅠㅠ
public class MakeHamburger {

    int count = 0;

    public int solution(int[] ingredient) {
        List<Integer> ingredients = new ArrayList<>();
        for (int index : ingredient) {
            ingredients.add(index);
        }
        exceptHamburger(ingredients);
        return count;
    }

    public List<Integer> exceptHamburger(List<Integer> ingredients) {
        boolean flag = false;
        int index = 0;
        while (index < ingredients.size() - 3) {
            if (ingredients.get(index) == 1 && ingredients.get(index + 1) == 2 && ingredients.get(index + 2) == 3
                    && ingredients.get(index + 3) == 1) {
                count += 1;
                flag = true;
                break;
            } else {
                index++;
            }
        }
        if (flag) {
            List<Integer> result;
            if (index - 3 < 0) {
                result = ingredients.subList(0, index);
            } else {
                result = ingredients.subList(index - 3, index);
            }
            result.addAll(ingredients.subList(index + 4, ingredients.size()));
            return exceptHamburger(result);
        } else {
            return ingredients;
        }
    }

    public int[] exceptHamburger(int[] ingredients) {
        int[] result;
        boolean flag = false;
        int index = 0;
        while (index < ingredients.length - 3) {
            if (ingredients[index] == 1 && ingredients[index + 1] == 2 && ingredients[index + 2] == 3
                    && ingredients[index + 3] == 1) {
                count += 1;
                flag = true;
                break;
            } else {
                index++;
            }
        }
        if (flag) {
            int[] arr1;
            if (index - 3 < 0) {
                arr1 = Arrays.copyOfRange(ingredients, 0, index);
            } else {
                arr1 = Arrays.copyOfRange(ingredients, index - 3, index);
            }
            int[] arr2 = Arrays.copyOfRange(ingredients, index + 4, ingredients.length);
            int[] arr3 = IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).toArray();
            return exceptHamburger(arr3);
        } else {
            return ingredients;
        }
    }

    /*
    https://yongku.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%ED%96%84%EB%B2%84%EA%B1%B0-%EB%A7%8C%EB%93%A4%EA%B8%B0-%EC%9E%90%EB%B0%94JAVA
     */
    public int solutionTwo(int[] ingredient) {
        int answer = 0;
        List<Integer> ingredients = new ArrayList<>();
        List<Integer> example = new ArrayList<>();
        example.add(1);
        example.add(2);
        example.add(3);
        example.add(1);

        for (int number : ingredient) {
            ingredients.add(number);

            if (ingredients.size() >= 4) {
                List<Integer> temp = new ArrayList<>();
                temp.add(ingredients.get(ingredients.size() - 4));
                temp.add(ingredients.get(ingredients.size() - 3));
                temp.add(ingredients.get(ingredients.size() - 2));
                temp.add(ingredients.get(ingredients.size() - 1));
                if (temp.equals(example)) {
                    answer++;
                    ingredients.remove(ingredients.size() - 1);
                    ingredients.remove(ingredients.size() - 1);
                    ingredients.remove(ingredients.size() - 1);
                    ingredients.remove(ingredients.size() - 1);
                }
            }
        }
        return answer;
    }
}
