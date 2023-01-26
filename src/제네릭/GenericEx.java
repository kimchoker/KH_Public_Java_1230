package 제네릭;

import java.util.ArrayList;
import java.util.List;

// 제네릭 : 데이터 타입을 일반화 한다는 의미.
// 데이터 형식에 관계없이 하나의 값이 여러 다른 데이터 타입을 가질 수 있도록 하는 방법
// 객체타입만 넣을 수 있음 기본타입은 안됨
// - 컴파일시에 강한 타입을 체크
// - 타입 변환을 제거

//        // 캐스팅을 하는 경우(옛날 문법)
//        List list = new ArrayList();
//        list.add("hello");
//        String str = (String) list.get(0);
//
//        // 제네릭 타입
//        List<String> list2 = new ArrayList<>(); // 이렇게 제네릭 타입으로 String을 선언해두면
//        list2.add("ㅁㄴㄹㄹㅇㄴㅁ"); // 이 안에 String 이외의 자료형은 들어가지 않음
//        String str2 = list2.get(0);
public class GenericEx {
    public static void main(String[] args) {
        Person<String> p1 = new Person<>("준혁");
        System.out.println(p1.info);
        Person<Integer> p2 = new Person<>(926);
        System.out.println(p2);


    }
}
// 제네릭 타입의 선언 public class 클래스명 <T> {....}
// T는 타입 변수를 의미하며, 이름은 T가 아니어도 되지만 일반적으로 T를 많이 씀
class Person <T> {
    public T info;
    Person(T info) {
        this.info = info;
    }
}