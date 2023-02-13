package 명함다중전송서버;

import 명함전송서버샘플.NameCard;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiSerialEx2 {
    static List<NameCard> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int port = 9999;
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("접속자 IP " + socket.getRemoteSocketAddress());
                Thread serverTh = new MultiSndThread(socket);
                System.out.println("명함을 전송하시겠습니까?");
                if (sc.next().equalsIgnoreCase("y")) {
                    System.out.println("전송을 시작합니다.");
                    serverTh.start();

                } else System.out.println("전송을 취소합니다.");
            }
        } catch (IOException e) {}
    }

    static List<NameCard> writeNameCard() {
        list.add(new NameCard("유지민", "010-8253-5681", "asdn@naver.com", "집"));
        list.add(new NameCard("장원영", "010-7851-4581", "vvds@naver.com", "방"));
        list.add(new NameCard("안유진", "010-3211-4773", "vvbn@naver.com", "지하철"));
        list.add(new NameCard("김채원", "010-3562-5424", "jkk@naver.com", "버스"));
        list.add(new NameCard("사쿠라", "010-0123-0422", "jiok@naver.com", "기차"));
        list.add(new NameCard("하니", "010-4562-5751", "yyju@naver.com", "배"));
        list.add(new NameCard("민지", "010-6651-5452", "ahng@naver.com", "비행기"));
        list.add(new NameCard("배주현", "010-8212-5081", "qerh@naver.com", "방주"));
        list.add(new NameCard("임나연", "010-8253-4487", "vhjj@naver.com", "탱크"));
        list.add(new NameCard("ㅁㄴㅇㄹ", "010-8253-5681", "asdn@naver.com", "전투기"));
        return list;
    }
}