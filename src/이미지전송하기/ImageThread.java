package 이미지전송하기;
import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImageThread extends Thread{
    Socket socket;
    static List<Socket> sockets = new ArrayList<>();
    public ImageThread(Socket socket) {
        this.socket = socket;
        sockets.add(socket);
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);

        String originalFileName = "C:/Users/user2/Desktop/001.jpg";
        try {
            for(int i = 0; i < sockets.size(); i++) {
                InputStream is = new FileInputStream(originalFileName);
                OutputStream os = sockets.get(i).getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(os);
                oos.write(is.readAllBytes());
                int readByteNo;
                byte[] readBuff = new byte[1024];
                while ((readByteNo = is.read(readBuff)) != -1) {
                    os.write(readBuff, 0, readByteNo);
                }
                oos.flush();
                oos.close();
                os.flush();
                os.close();
                is.close();
                System.out.println(sockets.get(i).getRemoteSocketAddress().toString() + "에게 전송했습니다");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}