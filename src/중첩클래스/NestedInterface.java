package 중첩클래스;
// 중첩 인터페이스는 클래스 내부에 선언한 인터페이스입니다.
// 중첩 인터페이스는 주로 UI 프로그램에서 자주 쓰임(안드로이드)
public class NestedInterface {
    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListener(new CallListener());
        button.touch();
        button.setOnClickListener(new MsgListener());
        button.touch();
    }
}
