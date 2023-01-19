package 리모컨인터페이스;

import java.util.Scanner;

public class RemoConInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("제품을 선택하세요 [1] TV [2] Audio");
        int sel = sc.nextInt();
        RemoteControl remoCon;
        if (sel == 1) {
            remoCon = new TV();
            remoCon.turnOn();
            remoCon.setVolume(30);
            remoCon.getInfo();
            remoCon.setMute(true);
            RemoteControl.changeBattery();
        } else {
            remoCon = new Audio();
            remoCon.turnOn();
            remoCon.setVolume(999);
            remoCon.getInfo();
        }


        RemoteControl rc = new RemoteControl() {
            int volume;

            @Override
            public void turnOn() {
                System.out.println("PlayStation 5 ON");
            }

            @Override
            public void turnoff() {
                System.out.println("PlayStation 5 OFF");
            }

            @Override
            public void setVolume(int volume) {
                if (volume > RemoteControl.MAX_VOLUME) {
                    this.volume = RemoteControl.MAX_VOLUME;
                } else if (volume < MIN_VOLUME) {
                    this.volume = RemoteControl.MIN_VOLUME;
                } else {
                    this.volume = volume;
                }
                System.out.println("현재 오디오 볼륨 : " + this.volume);
            }

            @Override
            public void getInfo() {
                System.out.println("오디오 입니다.");
                System.out.println("현재 볼륨은 " + volume + "입니다.");
            }
        };
        rc.turnOn();
        rc.setVolume(100);
        rc.getInfo();
    }
}