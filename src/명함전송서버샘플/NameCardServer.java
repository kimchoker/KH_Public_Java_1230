package 명함전송서버샘플;

import javax.naming.Name;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameCardServer {
    static List<NameCard> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        int port = 8990;
        ServerSocket serverSocket = new ServerSocket(port);
        Scanner sc = new Scanner(System.in);
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("클라이언트 : " + socket.getRemoteSocketAddress());
            System.out.println("명함을 전송하시겠습니까? y/n");
            String sel = sc.next();
            if (sel.equalsIgnoreCase("y")) {
                OutputStream os = socket.getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(os);
                oos.writeObject(writeNameCard());
                oos.flush();
                oos.close();
                os.close();
            }
        }
    }

    static List<NameCard> writeNameCard() {
        list.add(new NameCard("김준혁", "010-8253-5681", "asdn@naver.com", "집"));
        list.add(new NameCard("유경연", "010-7851-4581", "vvds@naver.com", "방"));
        list.add(new NameCard("김영웅", "010-3211-4773", "vvbn@naver.com", "지하철"));
        list.add(new NameCard("임재린", "010-3562-5424", "jkk@naver.com", "버스"));
        list.add(new NameCard("김민정", "010-0123-0422", "jiok@naver.com", "기차"));
        list.add(new NameCard("이하연", "010-4562-5751", "yyju@naver.com", "배"));
        list.add(new NameCard("김유진", "010-6651-5452", "ahng@naver.com", "비행기"));
        list.add(new NameCard("박지은", "010-8212-5081", "qerh@naver.com", "방주"));
        list.add(new NameCard("김현준", "010-8253-4487", "vhjj@naver.com", "탱크"));
        list.add(new NameCard("박민영", "010-8253-5681", "asdn@naver.com", "전투기"));
        return list;
    }
}
