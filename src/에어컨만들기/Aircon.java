package 에어컨만들기;
//전원 온오프
//온도 조절 가능
//현재온도 표시 기능
//쿨러 온오프
//히터 온오프
//바람세기 1~3단

import java.util.Calendar;
import java.util.Scanner;

public class Aircon {
    boolean isPower; // 전원 온오프
    int setTemp; // 온도 설정
    int currTemp; // 현재 온도
    boolean isCooler; // 에어컨 온오프 여부
    boolean isHeater; // 히터 온오프 여부
    int windStep; // 1~3단

    Aircon() { // 생성자 : 클래스가 객체가 될 때 자동으로 호출, 인스턴스 필드 초기화가 주목적
        final int[] monthTemp = {-5, 3, 8, 15, 20, 26, 32, 30, 24, 16, 9, 4};
        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH); // month는 현재 몇월인지 정보를 가져오는데 배열의 인덱스와 같음
        currTemp = monthTemp[month];
        isPower = false; // 전원에 대한 인스턴스 필드 OFF
        setTemp = 18;
        isCooler = false;
        isHeater = false;
        windStep = 1;

    }

    // 에어컨 정보 출력 (온도의 변화가 있을 때)
    public void airConInfo() {
        String onOffStr = (isPower) ? "ON" : "OFF";
        String heaterStr = (isHeater) ? "ON" : "OFF";
        String coolerStr = (isCooler) ? "ON" : "OFF";
        final String[] windStr = {"", "1단계", "2단계", "3단계"};
        System.out.println("======에어컨 정보======");
        System.out.println("전원 : " + onOffStr);
        System.out.println("현재 온도 : " + currTemp);
        System.out.println("설정 온도 : " + setTemp);
        System.out.println("히터 : " + heaterStr);
        System.out.println("쿨러 : " + coolerStr);
        System.out.println("바람 세기 : " + windStr);

    }

    //에어컨 설정하기
    public void setAirConState() {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 온도가 " + currTemp + "입니다.");
        System.out.print("온도를 설정하세요 : ");
        setTemp = sc.nextInt();
        System.out.println("설정 온도는 " + setTemp + "입니다.");
        System.out.print("바람 세기를 설정하세요 (1단/2단/3단) : ");
        windStep = sc.nextInt();
        if (currTemp > setTemp) { // 현재가 더우면
            System.out.println("Cooler 가 동작합니다.");
            isCooler = true;
            isHeater = false;
        } else if (setTemp > currTemp) { // 현재가 추우면
            System.out.println("Heater 가 동작합니다.");
            isCooler = false;
            isHeater = true;
        } else {
            isHeater = false;
            isCooler = false;
        }
    }

    public void setPower(boolean power) {
        isPower = power;
    }

    public int getWindStep() {
        return windStep;
    }

    public boolean isHeater() {
        return isHeater;
    }

    public boolean isCooler() {
        return isCooler;
    }

    // 현재 온도 변경
    public void setCurrTemp(int n) {
        currTemp += n;

    }

    public int getCurrTemp() {
        return currTemp;
    }
    // 설정온도 읽기
    public int getSetTemp() {
        return setTemp;
    }
}