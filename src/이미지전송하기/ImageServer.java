package 이미지전송하기;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ImageServer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int port = 9999;
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("접속자 IP " + socket.getRemoteSocketAddress());
                Thread serverTh = new ImageThread(socket);
                System.out.println("이미지를 전송하시겠습니까?");
                if (sc.next().equalsIgnoreCase("y")) {
                    System.out.println("전송을 시작합니다.");
                    serverTh.start();
                } else System.out.println("전송을 취소합니다.");
            }
        } catch (IOException e) {}
    }
}