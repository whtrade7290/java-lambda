package Lambda_EX;

import java.util.function.Function;

public class ex03 {
    public static void main(String[] args) {
        Function<Integer, String> r = t -> {
            String result = "";
            for (int i = 0; i < t; i++){
                result += "만세\n";
            }
          return result;
        };
        System.out.println("=== 만세삼창 ===");
        System.out.println(r.apply(3));

    }
}

