package 박싱과언박싱;
// 프로그램의 동작에 있어 기본타입의 데이터를 객체로 취급해야 하는 경우가 있음 (일반화 프로그램 관련 - 컬렉션 프레임워크)
// Wrapper 클래스는 8개의 기본타입에 대해 객체 타입으로 포장해주는 클래스를 Wrapper 클래스라고 부른다.
// Boxing : 기본타입을 자동으로 Wrapper 클래스 타입으로 변환해주는 것을 말함
// Unboxing : Wrapper 클래스 타입을 기본타입으로 변환해주는 것을 말한다.
public class BoxingEx {
    public static void main(String[] args) {
        Integer num = 10;
        // 이건 원래 Integer num = new Integer(10)으로 표시되어야 함
        // 하지만 Wrapper 클래스가 자동으로 변환해줌 자바 1.5 이후로 생겨난 문법
        Character ch = 'x';
        // Character ch = new Character('x');
        // 위랑 같은거임
        // int n = num.intValue(); // 언박싱
        int n = num;
    }
}
