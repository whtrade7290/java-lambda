package Lambda_EX;

import java.util.function.Supplier;

public class ex04 {
    public static void main(String[] args) {
        Runnable r = () -> {
          System.out.println("Runnable는 매개변수도 없으며 반환자료형도 없습니다.");
        };

        r.run();

        Supplier<String> s = () -> {
            return "Supplier는 매개변수는 없지만 반환 자료형은 있습니다.";
        };
        System.out.println(s.get());
    }
}
