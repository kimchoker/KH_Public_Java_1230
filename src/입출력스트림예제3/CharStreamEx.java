package 입출력스트림예제3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// Writer 은 문자 스트림의 최상위 클래스 입니다.
public class CharStreamEx {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("test.txt");
//        char[] data = "김준혁".toCharArray(); // 문자열을 문자 배열로 변환
        String data = "김준혁";
//        for (int i = 0; i < data.length; i++) {
//            writer.write(data[i]); // 문자열 파일에 write
//        }
        writer.write(data); // write(char[] c)
        writer.flush(); // write() 이후에는 반드시 버퍼를 비워줘야 함
        writer.close(); // 스트림을 닫고 자원을 반납함
    }
}
