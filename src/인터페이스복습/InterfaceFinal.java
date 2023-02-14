package 인터페이스복습;
// 인터페이스에 포함된 메소드는 기본적으로 추상 메소드. (구현부가 존재하지 않은것이 특징)
// 구현부가 없기 때문에 메소드를 상속받은 클래스는 반드시 해당 메소드를 구현해야 함
// 인터페이스는 다중 상속 지원을 위해서 사용.

import java.util.Scanner;

public class InterfaceFinal {
    public static void main(String[] args) {
        NetAdapter netAdapter;
        Cocoatok cocoatok = new Cocoatok("KY");
        Scanner sc = new Scanner(System.in);
        System.out.print("네트워크 선택 1. WiFi 2. 5G : ");
        int sel = 0;
        if(sel == 1) netAdapter = new Wifi();
        else netAdapter = new FiveG();
        cocoatok.writeMsg("ccc");
        cocoatok.connect(netAdapter);
        cocoatok.send(netAdapter);
    }
}

class Cocoatok {
    private String to;
    private String msg;
    public Cocoatok(String name) {
        to = name; // 상대방의 이름

    }
    public void writeMsg(String msg) {
        this.msg = to + " : " + msg;
    }
    public void connect(NetAdapter adapter) {
        adapter.connect();
    }
    public void send (NetAdapter adapter) {
        adapter.send(msg);
    }
}

interface NetAdapter {
    void connect();
    void send(String msg);


}
class Wifi implements NetAdapter {

    @Override
    public void connect() {
        System.out.println("WiFi 연결 성공");
    }

    @Override
    public void send(String msg) {
        System.out.println("WiFi >>" + msg);
    }
}

class FiveG implements NetAdapter {


    @Override
    public void connect() {
        System.out.println("5G 연결 성공");
    }

    @Override
    public void send(String msg) {
        System.out.println("5G >>" + msg);
    }
}