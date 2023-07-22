package Stream_EX;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

// toList 스태틱화
import static java.util.stream.Collectors.toList;
// toSet 스태틱화
import static java.util.stream.Collectors.toSet;

public class ex17 {
    public static void main(String[] args) {
        String[] animals = {"cat", "dog", "rabbit", "cat", "dog", "tiger", "dog", "cat"};

        System.out.println("** 기본 배열 출력");
        System.out.println(Arrays.toString(animals));

        System.out.println("** 리스트로 변환 후 출력");
        List<String> ani1 = Arrays.stream(animals)
                // toList 스태틱화 Collectors 생략(Collectors.toList())
                .collect(toList());
        System.out.println("ani1: " + ani1);

        System.out.println("** Set 변환 후 출력");
        Set<String> ani2 = Arrays.stream(animals)
                .collect(toSet());
        System.out.println("ani2: " + ani2);

        System.out.println("** TreeSet 변환 후 출력");
        TreeSet<String> ani3 = Arrays.stream(animals)
                .collect(Collectors.toCollection(() -> new TreeSet<>()));
        System.out.println("ani3: " + ani3);

        System.out.println("** HashMap 변환 후 출력");
        Map<String, Integer> ani4 = Arrays.stream(animals)
                .collect(Collectors.toMap(Function.identity(), String::length, (x1, x2) -> x1 + x2));
        System.out.println("ani4: " + ani4);



    }

}
