package Lambda_EX;

public class ex02 {
    public static void main(String[] args) {
        Runnable r = () -> {
          System.out.println("익명 내부 클래스 실행22");
        };

        r.run();
        r.run();
    }
}
