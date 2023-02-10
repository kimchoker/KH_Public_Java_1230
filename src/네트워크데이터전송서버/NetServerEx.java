package 네트워크데이터전송서버;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class NetServerEx {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress("localhost", 5001));
        while (true) {
            System.out.println("[waiting..]");
            Socket socket = serverSocket.accept();
            InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
            System.out.println("[accepted] " + isa.getHostName());

            byte[] bytes = null;
            String message = null;
            OutputStream os = socket.getOutputStream();
            message = "hi";
            bytes = message.getBytes(StandardCharsets.UTF_8);
            os.write(bytes);
            os.flush();
            System.out.println("good");
            os.close();

            InputStream is = socket.getInputStream(); // 소켓으로부터 입력받기(바이트 단위)
            bytes = new byte[100];
            int readByteCnt = is.read();
            message = new String(bytes, 0 , readByteCnt, StandardCharsets.UTF_8);
            System.out.println("[completed]" + message);
        }
    }
}
