package Stream_EX;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ex11 {
    public static void main(String[] args) {
        // Stream을 활용하여 1부터 100까지의 배열을 생성
        int[] numbers = IntStream.rangeClosed(1, 100).toArray();

        // Stream을 활용하여 배열 출력
        Arrays.stream(numbers).forEach(x -> System.out.println(x));

        List<String> list = Arrays.asList("빵형", "광명컴쟁이");
        Object[] result = list.stream().toArray();

        Arrays.stream(result).forEach(x -> System.out.println(x));
    }
}
