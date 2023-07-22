package Stream_EX;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ex18 {
    public static void main(String[] args) {
        String[][] level = {
                {"빵형", "초급"}, {"빵형", "초중급"}, {"타노스", "중급"},{"타노스", "중고급"}, {"상도", "고급"}, {"상도", "특급"}, {"상도", "초급"}
        };

        Map<Object, Object> map = Arrays.stream(level)
                .collect(Collectors.toMap(x -> x[0], x -> x[1], (x, y) -> y));

        System.out.println(map);
    }
}
