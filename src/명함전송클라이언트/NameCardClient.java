package 명함전송클라이언트;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class NameCardClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        System.out.println("[연결 중입니다]");
        socket.connect(new InetSocketAddress("localhost", 928));
        System.out.println("[연결 되었습니다]");



        InputStream is = socket.getInputStream();



        for (int i = 0; i < 10; i ++) {
            byte[] bytes = bytes = new byte[1000];
            int readByteCount = is.read(bytes);
            String nameCard = new String(bytes, 0, readByteCount, StandardCharsets.UTF_8);
            System.out.println(nameCard);

        }
        is.close();
        socket.close();
    }
}
