package Lambda_EX;

import lombok.Getter;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ex14 {
    public static void main(String[] args) {
        Function<String, String> helloLambda = name -> HelloTo.hello(name);
        System.out.println(helloLambda.apply("빵형"));

        Function<String, String> helloStatic = HelloTo::hello;
        System.out.println(helloStatic.apply("파티쉐"));

        UnaryOperator<String> unaryOperator = HelloTo::hello;
        System.out.println(unaryOperator.apply("우현"));

        Consumer consumer = x -> {
            String str = HelloTo.hello(x.toString());
            System.out.println(str);
        };

        consumer.accept("테스트");
    }


}
@Getter
class HelloTo {
    public static String hello(String name){
        return "Hello~ " + name;
    }
}
