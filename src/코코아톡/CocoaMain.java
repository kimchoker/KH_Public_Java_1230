package 코코아톡;

import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {
        CocoaTok cocoaTok = new CocoaTok("경연");
        cocoaTok.writeMsg("사랑해");
        NetAdapter adapter; // 인터페이스를 참조 변수로 선언
        Scanner sc = new Scanner(System.in);
        System.out.println("네트워크를 선택하세요 [1]WiFi [2]5G");
        int sel = sc.nextInt();
        if(sel == 1)
            adapter = new WiFi();
         else adapter = new FiveG();
        cocoaTok.send(adapter);

    }
}
