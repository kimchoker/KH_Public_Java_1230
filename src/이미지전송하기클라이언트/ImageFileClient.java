package 이미지전송하기클라이언트;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ImageFileClient {
    public static void main(String[] args) throws IOException {
        String serverIp = "192.168.10.231";
        System.out.println(serverIp+"서버에 연결중입니다.");
        System.out.println();

        Socket socket = new Socket(serverIp, 1021);

        System.out.println("서버에 연결되었습니다.");
        System.out.println();

        try{
            InputStream is = socket.getInputStream();

            FileOutputStream fo = new FileOutputStream("d:/d_Other/upload/흰토끼.jpg");

            int c;

            while((c=is.read())!=-1){
                fo.write(c);
            }

            fo.close();
            is.close();

            socket.close();
        } catch(IOException e){

        }
    }
}
