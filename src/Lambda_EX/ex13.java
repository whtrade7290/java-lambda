package Lambda_EX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex13 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // 1 유형
        for (Integer i : list ) {

            Winter.doWrite(i);
        }
        // 2 유형
        list.forEach(x -> {
            Winter.doWrite(x);
        });
        // 3유형(매개변수가 같을 때, 더블콜론 사용 가능)
        list.forEach(Winter::doWrite);











//        List<String> list = new ArrayList<>();
//        list.add("dog");
//        list.add("cat");
//        list.add("lion");
//
//        list.forEach(x -> {
//            String ani = x;
//            System.out.println("긴 식: " + ani);
//        });
//
//        list.forEach(x -> System.out.println("중간 식: " + x));
//
//
//        System.out.println("== 더블콜론사용 ==");
//        list.forEach(System.out::println);



    }
}

class Winter {
    public static void doWrite(Object msg){
        System.out.println(msg);
    }
}
