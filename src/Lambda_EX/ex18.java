package Lambda_EX;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.function.Supplier;

public class ex18 {
    public static void main(String[] args) {
//        Person p = new Person(1, "빵형");
//        (a, b) -> new Person(a, b);
//        Person:: new;

        Supplier<Name> supplier1 = () -> new Name();
        Name name1 = supplier1.get();
        System.out.println("람다식 - " + name1.getName());

        Supplier<Name> supplier2 = Name::new;
        Name name2 = supplier2.get();
        System.out.println("생성자 참조 - " + name2.getName());

    }
}
@Getter
@NoArgsConstructor
class Name {
    private String name = "빵형";

}
