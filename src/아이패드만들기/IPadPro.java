package 아이패드만들기;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class IPadPro {
    int screen; // 화면 크기 : 11, 12.9
    int color; // 색상 : 스페이스그레이, 실버
    int memory; // 용량 : 12GB, 256GB, 512GB, 1TB
    int network; // 네트워크 : Wi-Fi, WiFi + Cellular
    String name; // 각인 서비스 신청 시 이름 저장
    String productDate; // 제품 생산 일자
    String serialNum; // 제품의 일련번호 : iPad13128C2301111
    static int cnt = 0; // 클래스 변수(객체 생성시 생성되지 않고 클래스에 소속된 변수)

    IPadPro(String name) { // 생성자 : 클래스가 객체로 만들어 질 때 호출
        this.name = name;
        Date now = new Date(); // 시간정보를 자겨오기 위해 Date 클래스를 객체로 생성
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        productDate = sdf.format(now); // 년/월/일 정보를 얻어 인스턴스 변수에 저장
        cnt++;
        productDate += cnt;
    }
    boolean continueOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("========== iPad Pro 구매하기 ==========");
        System.out.println("구입하시려면 yes / 종료는 quit : ");
        String isProduct = sc.next();
        if(isProduct.equalsIgnoreCase("yes")) return true;
        else return false;
    }


    void setScreen() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("디스플레이 선택 [1] 11인치, [2] 12.9인치 : ");
            screen = sc.nextInt();
            if (screen == 1 || screen == 2) return;
            System.out.println("디스플레이를 다시 선택하세요");
        }

    }

    void setColor() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("색상 선택 [1] 스페이스그레이, [2] 실버 : ");
            color = sc.nextInt();
            if (color == 1 || color == 2) return;
            System.out.println("색상을 다시 선택하세요");
        }

    }

    void setMemory() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("용량 선택 [1] 128GB, [2] 256GB, [3] 512GB, [4] 1TB : ");
            memory = sc.nextInt();
            if (memory > 1 && color < 5) return;
            System.out.println("용량을 다시 선택하세요");
        }
    }

    void setNetwork() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("네트워크 선택 [1] Wi-Fi, [2] Cellular : ");
            network = sc.nextInt();
            if (network == 1 || network == 2) return;
            System.out.println("네트워크를 다시 선택하세요");

        }
    }
    void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("각인 서비스를 신청하시겠습니까?");
        String service = sc.next(); // 각인 서비스의 신청 여부를 묻는 문자열
        if(service.equalsIgnoreCase("yes")) {
            System.out.println("=== 각인 문구를 입력하세요 ===");
            name = sc.next();
        }
    }
    // 시리얼넘버란 제품의 고유번호. 제품마다 유일한 값을 가짐
    //iPad + 11/13 + 128/256/512/1024 + W/C + yyMMdd + 생산된 기기수
    void setSerialNum() {
        String screenStr = (screen == 1) ? "11" : "13";
        String[] memoryStr = {"", "128", "256", "512","1024"};
        String networkStr = (network == 1) ? "W" : "C";
        serialNum = "iPad" + screenStr + memoryStr[memory] + networkStr + productDate;
    }
    // 제품 구매가 완료되면 출고까지 30초가 소요됨
    void inProductionPad() throws InterruptedException{
        int cnt = 0;
        while (true) {
            sleep(300); // 밀리초기때문에 1초는 1000밀리초다
            cnt++;
            System.out.print("<< iPad Pro 제작 중 : ["+ cnt + "%]");
            System.out.print("\r");
            if(cnt >= 100) break;
        }
    }
    void viewProductPad() {
        final String[] screenType = {"", "11인치", "12.9인치"};
        final String[] colorType = {"", "Spacegray", "Silver"};
        final String[] memType = {"", "128GB","256GB","512GB","1TB"};
        final String[] netType = {"","Wi-Fi","Cellular"};
        System.out.println("==========iPad Pro 가 출고 완료되었습니다==========");
        System.out.println("화면 크기 : " + screenType[screen]);
        System.out.println("제품 색상 : " + colorType[color]);
        System.out.println("제품 용량 : " + memType[memory]);
        System.out.println("네트워크 : " + netType[network]);
        System.out.println("각인 : " + name);
        System.out.println("일련번호 : " + serialNum);
        System.out.println("----------------------------------------------");
    }
}