package 스트링버퍼;
import java.lang.*; // 넣지 않아도 lang에 있는 기능을 쓰면 컴파일러에 의해 추가됨. (기본 패키지이기 때문)
// StringBuffer : 문자열을 추가하거나 변경할 때 사용되는 자료형 (동기화 처리가 있음 = 멀티스레딩에 유리)
// StringBuilder : 문자열을 추가하거나 변경할 때 사용되는 자료형(동기화 처리가 없음)
// String : 문자열을 + 연산자로 추가하면 추가 할 때마다 새로운 문자열이 생성 됨
// append(), delete(), insert(), substring()
public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(); // StringBuffer 객체 생성
        sb.append("hello");
        sb.append(" ");
        sb.append("to java");
        sb.append(" ");
        sb.append("javascript");
        sb.delete(1, 3); // 1번 인덱스부터 3번 인덱스 미만까지
        sb.insert(0, "test"); // 해당 인덱스에 문자열을 추가함
        System.out.println(sb);
        System.out.println(sb.substring(0, 4));

        String rst = "";
        rst += "hello";
        rst += " ";
        rst += "to java";
        System.out.println(rst);
    }
}
