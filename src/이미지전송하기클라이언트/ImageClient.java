package 이미지전송하기클라이언트;
import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ImageClient {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Socket socket = new Socket("192.168.10.235", 9999);
        System.out.println("서버 접속 성공");
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        System.out.println("경로를 입력하세요");
        String path = sc.nextLine();
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path));
        ArrayList<Byte> b = new ArrayList<>();

        int sum = 0;
        int len;
        int size = 1024;
        byte[] data = new byte[size];



        while ((len = ois.read(data)) != -1) {
            bos.write(data, 0, len);
            sum += len;

        }
        bos.flush();
        bos.close();
        ois.close();

    }
}