package 입출력스트림예제1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// 바이트 출력 스트림 : 바이트 단위로 데이터를 전송, 속도가 빠름
// 바이트 스트림의 최상위 추상 클래스는 OutputStream 입니다.
// FileOutputStream, BufferedOutputStream, DataOutputStream, PrintStream
// close() : 스트림을 닫음
// flush() : 스트림 버퍼의 내용을 모두 내보냄
// write() : 값을 출력
public class ByteOutStreamEx {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("test0207.db");
        byte[] arr = {10, 20, 30};
        os.write(arr, 1, 3); // 배열 인덱스 1번 부터 3개의 값을 출력
        os.flush(); // write() 메소드 사용 시 반드시 flush() 버퍼 비우기가 필요함
        os.close(); // 스트림을 사용한 후 반드시 닫음(자원을 반납함)
    }
}
