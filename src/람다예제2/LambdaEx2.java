package 람다예제2;
// 매개변수가 있는 람다식 : MyFuncInterface fi = x -> {....}
@FunctionalInterface // 함수형 인터페이스 문법 체크를 위한 이노테이션
interface MyFuncInterface {
    public void method(int x); // 원래는 함수만 있으면 되지만, 자바 문법의 특징 때문에 인터페이스가 필요함
}

public class LambdaEx2 {
    public static void main(String[] args) {
        MyFuncInterface fi = x -> {
            int result = x * 5;
            System.out.println(result);
        };
        fi.method(3);
    }
}
