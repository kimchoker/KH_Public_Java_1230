package 명함전송클라이언트샘플;

import 명함전송서버샘플.NameCard;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

public class NameCardClientEx {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket socket = new Socket("192.168.10.245", 8990);
        System.out.println("서버 접속 성공");
        InputStream is = socket.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);
        List<NameCard> nameCards = (List<NameCard>) ois.readObject();
        viewNameCard(nameCards);
    }
    static void viewNameCard(List<NameCard> nameCard) {
        for(NameCard e : nameCard) {
            System.out.println(e.getName());
            System.out.println(e.getPhone());
            System.out.println(e.getCompany());
            System.out.println(e.geteMail());
            System.out.println();
        }
    }
}
