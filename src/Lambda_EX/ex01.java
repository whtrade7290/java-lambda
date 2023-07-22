package Lambda_EX;

public class ex01 {
    public static void main(String[] args) {

        Sample01Function f = () ->{
            System.out.println("샘플01테스트 출력1");
            System.out.println("샘플01테스트 출력2");
        } ;

        f.test();

        Sample02Function f2 = (a) -> a;
        System.out.println(f2.test("샘플02테스트 출력"));

        Sample02Function f3 = a -> {
            return a;
        };
        System.out.println(f2.test("샘플02테스트 출력"));
    }
}

@FunctionalInterface
interface Sample01Function {
    public void test();

}

@FunctionalInterface
interface Sample02Function {
    public String test(String a);

}
