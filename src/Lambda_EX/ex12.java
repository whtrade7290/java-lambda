package Lambda_EX;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ex12 {
    public static void main(String[] args) {
        // Function은 매개변수와 반환자료형을 각각 정의
        Function<String, String> sourceFile = p -> p + ".java";

        // UnaryOperator는 매개변수와 반환 자료형을 하나로 정의
        UnaryOperator<String> classFile = (String p) -> p + ".class";

        System.out.println(sourceFile.apply("Sample21"));
        System.out.println(classFile.apply("Sample21"));

        Function<String, String> a = Function.identity();
        UnaryOperator<String> b = UnaryOperator.identity();

        System.out.println(a.apply("Python"));
        System.out.println(b.apply("Python"));
    }
}
