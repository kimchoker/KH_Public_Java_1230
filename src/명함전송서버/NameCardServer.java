package 명함전송서버;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 1. 명함 정보를 담을 클래스 생성
// 2. List 생성 후 10명에 대한 명함 정보 입력
// 3. NameCard Thread 를 만들어 연결 요청이 오는 클라이언트에 명함 전송하기
// 명함 전송 여부를 물어본다(전송하시겠습니까? y/n)
// 4. 클라이언트에서 명함을 수신하면 명함정보를 출력하기
public class NameCardServer {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress("localhost", 928));
        List<NameCard> cardList = new ArrayList<>();
        int num = 0;
        cardList.add(new NameCard("김준혁", "010-8253-5681", "asdn@naver.com", "집"));
        cardList.add(new NameCard("유경연", "010-7851-4581", "vvds@naver.com", "방"));
        cardList.add(new NameCard("김영웅", "010-3211-4773", "vvbn@naver.com", "지하철"));
        cardList.add(new NameCard("임재린", "010-3562-5424", "jkk@naver.com", "버스"));
        cardList.add(new NameCard("김민정", "010-0123-0422", "jiok@naver.com", "기차"));
        cardList.add(new NameCard("이하연", "010-4562-5751", "yyju@naver.com", "배"));
        cardList.add(new NameCard("김유진", "010-6651-5452", "ahng@naver.com", "비행기"));
        cardList.add(new NameCard("박지은", "010-8212-5081", "qerh@naver.com", "방주"));
        cardList.add(new NameCard("김현준", "010-8253-4487", "vhjj@naver.com", "탱크"));
        cardList.add(new NameCard("박민영", "010-8253-5681", "asdn@naver.com", "전투기"));
//
        while (true) {
            System.out.println("[연결 대기중]");
            Socket socket = serverSocket.accept();
            InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
            System.out.println("[연결되었습니다] " + isa.getHostName());
            System.out.print("명함을 전송 하시겠습니까? [1] Y [2] N : ");
            switch (sc.nextInt()) {
                case 1 -> {
                    for (int i = 0; i < 10; i++) {
                        byte[] bytes = null;
                        String nameCard = null;
                        OutputStream os = socket.getOutputStream();
                        nameCard = cardList.get(num).getName() + "\n"
                                + cardList.get(num).getPhoneNumber() + "\n"
                                + cardList.get(num).getAddress() + "\n"
                                + cardList.get(num).geteMail() + "\n";
                        bytes = nameCard.getBytes(StandardCharsets.UTF_8);
                        os.write(bytes);
                        os.flush();
                        num++;
                    }
                }
                case 2 -> System.out.println("전송을 취소하셨습니다.");

//            }
            }
        }
    }
}