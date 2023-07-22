package Lambda_EX;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.function.Supplier;

public class ex05 {
    public static void main(String[] args) {
        MessageCenter mc = new MessageCenter("Hello~~ Lambda!");
        Supplier<MessageCenter> param = () -> mc;
        MessageCenter main = getMsg(param);
        System.out.println(main);

    }

    public static MessageCenter getMsg(Supplier<MessageCenter> mc){
        return mc.get();
    };
}
@RequiredArgsConstructor
class MessageCenter {
    private final String msg;

    @Override
    public String toString() {
        return msg;
    }


}
