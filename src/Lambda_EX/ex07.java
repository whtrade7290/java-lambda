package Lambda_EX;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ex07 {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(
                new Employee(1, "학건", 2400),
                new Employee(2, "인호", 2700),
                new Employee(3, "상도", 3000),
                new Employee(4, "빵형", 3200)
        );

        Consumer<Employee> consumer = x -> {
          x.setSalary(x.getSalary() *2);
        };
        System.out.println("== 연봉 두배 인상 ==");
        doubleSalary(emp, consumer.andThen(x -> System.out.println(x)));
        doubleSalary(emp, consumer.andThen(System.out::println));
    }

    private static void doubleSalary(List<Employee> emp, Consumer<Employee> f){
        for(Employee e : emp){
            f.accept(e);
        }
    }
}

@Data
@AllArgsConstructor
class Employee {
    private int no;
    private String name;
    private double salary;
}
