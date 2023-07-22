package Stream_EX;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ex20 {
    public static void main(String[] args) {
        List<String> locals = Arrays.asList("서울", "대전", "대구", "광주", "부산", "제주");
        List<String> reversedLocals =
                locals.stream()
                        .collect(Collectors.collectingAndThen(Collectors.toList(), city -> {
                         Collections.reverse(city);
                         return city.stream();

                        }
                        )
                        )
                        .collect(Collectors.collectingAndThen(Collectors.toList(), x -> Collections.unmodifiableList(x)));

        System.out.println(locals.toString());
        reversedLocals.add("대마도");
        System.out.println(reversedLocals.toString());



//        Collections.reverse(locals);
//        System.out.println(">>" + locals.toString());





    }
}
