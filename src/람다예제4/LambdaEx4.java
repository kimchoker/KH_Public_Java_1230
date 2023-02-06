package 람다예제4;
// 클래스 멤버와 로컬변수 : 클래스 멤버는 제약 없이 사용 가능, 로컬 변수는 제약이 있음
public class LambdaEx4 {
    public static void main(String[] args) {
        UsingThis usingThis = new UsingThis();
        UsingThis.Inner inner = usingThis.new Inner();
        inner.method();

    }
}

interface MyFuncInterface {
    public void method();
}

class UsingThis {
    public int outerField = 10;

    class Inner {
        int innerField = 20;

        void method() {
            int localValue = 40; // 메소드 내의 지역변수값은 변경될 수 없음
            // localValue = 30;
            MyFuncInterface mi = () -> {
                System.out.println("외부 필드 : " + outerField);
                System.out.println("외부 필드 : " + UsingThis.this.outerField);
                System.out.println("내부 필드 : " + innerField);
                System.out.println("내부 필드 : " + this.innerField);
                System.out.println("지역 변수 : " + localValue);
            };
            mi.method();
        }
    }
}