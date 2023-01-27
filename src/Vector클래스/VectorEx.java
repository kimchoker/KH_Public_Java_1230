package Vector클래스;
// ArrayList : 동적 배열(개수를 정하지 않아도 됨. 값이 추가될때마다 사이즈가 늘어남)
// 삽입과 삭제는 매우 느림 0(n), 동기화를 지원하지 않음(멀티스레드 환경을 지원하지 않음)
// Vector : 동적 배열, 물리적으로 연속된 공간, 내부구조는 ArrayList 와 동일. 동기화를 지원하지만 속도가 느림
// LinkedList : 물리적으로 연속되어 있지 않음. 링크드 리스트, 검색이 느림, 삽입/삭제는 빠름


import java.util.List;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        List<NameCard> vector = new Vector<>();
        vector.add(new NameCard("김준혁","dnajca@naver.com", "01086453645", "muzik"));
        vector.add(new NameCard("유경연","dnasdsa@naver.com", "0106025445", "music"));
        vector.add(new NameCard("김코웅","aadca@naver.com", "01086414215", "yagada"));
        vector.add(new NameCard("김현준","asdtya@naver.com", "01084226465", "pyondori"));

        for (NameCard e : vector) {
            System.out.println(e.name);
            System.out.println(e.mail);
            System.out.println(e.phone);
            System.out.println(e.jobs);

        }
    }
}
class NameCard {
    String name;
    String mail;
    String phone;
    String jobs;

    public NameCard(String name, String mail, String phone, String jobs) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.jobs = jobs;
    }
}