package 다중채팅클라이언트;

import java.net.Socket;
import java.util.Scanner;

public class MultiChatClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 9999);
            Scanner sc = new Scanner(System.in);
            System.out.print("이름을 설정하세요  : ");
            Thread sndTh = new MultiSnd(socket, sc.nextLine()); // 소켓 식별자와 이름을 넣어줌
            Thread rcvTh = new MultiRcv(socket); // 소켓 식별자를 생성자에 대입
            sndTh.start();
            rcvTh.start();
        } catch (Exception e) {
            System.out.println("서버 접속에 실패했습니다.");
        }
    }
}
