package 명함다중전송서버;

import 명함전송서버샘플.NameCard;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import static 명함다중전송서버.MultiSerialEx2.writeNameCard;

public class MultiSndThread extends Thread {
    Socket socket;
    static List<Socket> sockets = new ArrayList<>();
    static List<NameCard> list = new ArrayList<>();
    public MultiSndThread(Socket socket) {
        this.socket = socket;
        sockets.add(socket);
    }
    @Override
    public void run() {
        try {
            for(int i = 0; i < sockets.size(); i++) {
                OutputStream os = socket.getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(os);
                oos.writeObject(writeNameCard());
                oos.flush();
                oos.close();
                os.close();
                System.out.println(sockets.get(i).getRemoteSocketAddress().toString() + "에게 전송 완료");
            }
        } catch (IOException e) {}
    }
}
