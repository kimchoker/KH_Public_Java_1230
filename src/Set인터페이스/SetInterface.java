package Set인터페이스;
// SetInterface : 중복을 허용하지 않음, 순서를 유지하지 않음
// HashSet : HashCode() 메소드 리턴값을 사용하여 객체의 동일 여부 판단

import java.util.Arrays;
import java.util.HashSet;

public class SetInterface {
    public static void main(String[] args) {
        HashSet<Member> hashSet = new HashSet<>();
        hashSet.add(new Member(1, "준혁"));
        hashSet.add(new Member(2, "경연"));
        hashSet.add(new Member(3, "민영"));
        hashSet.add(new Member(4, "영웅"));

        for(Member e : hashSet) {
            e.showMember();
            System.out.println(e.hashCode());
            System.out.println("--------------------");
        }


    }
}
