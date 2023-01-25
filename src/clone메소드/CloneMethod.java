package clone메소드;
// clone() : 해당 객체(인스턴스)를 복제해 새로운 인스턴스를 생성
// 얕은 복사와 깊은 복사 개념이 필요
// 얕은 복사로 인해 주소가 복사되어 의도하지 않은 동작이 일어나는 문제를 해결하기 위해 깊은 복사를 수행한다.

import java.util.Scanner;

public class CloneMethod {
    public static void main(String[] args) {
        Member mem1 = new Member("seolet","JH", "123123", 27, true );
        Member mem2 = mem1.getMember();

        mem2.age = 321;
        mem2.name = "ㅇㅁㄹㅇ";

//        System.out.println("age : " + mem1.age);
//        System.out.println("name : " + mem1.name);
//        System.out.println("age : " + mem2.age);
//        System.out.println("name : " + mem2.name);
        String str1 = new String("ab");
        String str2 = new String("ab");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

    }
}
