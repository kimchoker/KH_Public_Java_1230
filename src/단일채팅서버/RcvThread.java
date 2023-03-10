package 단일채팅서버;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.SocketException;

// 수신 스레드 생성
public class RcvThread extends Thread{
    private final Socket socket; // 소켓값은 한번 정해지고 나면 바뀌지 않아야하기 때문에 final로 선언

    public RcvThread(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            DataInputStream buf = new DataInputStream(socket.getInputStream());
            String rcvString;
            while (true) {
                rcvString = buf.readUTF(); // 문자열로 읽어 냄 (바이트 단위로 스트림을 자바의 데이터 타입으로 변환)
                System.out.println("상대방 : " + rcvString);
            }
        } catch (SocketException e1) {
            System.out.println("상대방의 연결이 종료되었습니다.");
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
