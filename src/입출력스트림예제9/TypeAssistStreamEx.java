package 입출력스트림예제9;

import java.io.*;

// 기본 타입 입출력 보조 스트림 : Byte 스트림은 byte 단위의 입출력이므로,
// 자바의 지본 데이터 타입인 boolean, char, short, long, int, float, double 단위로 입력이 될 수 없음
// DataInputStream과 DataOutputStream 보조 스트림을 연결하면 기본 데이터 타입으로 출력 가능
public class TypeAssistStreamEx {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("primitive.db");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("김준혁");
        dos.writeDouble(99.5);
        dos.writeInt(2);

        dos.writeUTF("유경연");
        dos.writeDouble(99.42);
        dos.writeInt(1);

        dos.writeUTF("김코웅");
        dos.writeDouble(97.68);
        dos.writeInt(3);
        dos.flush();
        dos.close();

        FileInputStream fis = new FileInputStream("primitive.db");
        DataInputStream dis = new DataInputStream(fis);

        for(int i = 0; i < 3; i ++) {
            String name = dis.readUTF();
            double score = dis.readDouble();
            int order = dis.readInt();
            System.out.println(name + " : " + score + " : " + order);
        }
        dis.close();

    }
}
