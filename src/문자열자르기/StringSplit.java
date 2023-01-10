package 문자열자르기;

import java.util.Scanner;

// 시간을 입력받기 : 23:30:59 -> 오후 11시 30분 59초
// 시간 입력 : 12:3:1 -> 12시 03분 01초

public class StringSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour;
        int min;
        int sec;

        while(true) {
            System.out.println("시간을 입력하세요.");
            String time = sc.next();
            String[] result = time.split(":"); // 입력받은 값을 공백 기준으로 나누어 담음

            hour = Integer.parseInt(result[0]);
            min = Integer.parseInt(result[1]);
            sec = Integer.parseInt(result[2]);

            if (hour > 24 || min > 60 || sec > 60) {
                System.out.println("잘못된 시간 입력입니다.");
                System.out.println("다시 입력해주세요.");
                System.out.println();

            } else break;
        }
        // 이건 강사님이 새로 풀어준거
        if(hour > 11) System.out.printf("오후 %02d시 %02d분 %02d초\n", (hour-12), min, sec);
        else System.out.printf("오전 %02d시 %02d분 %02d초\n", hour, min, sec);


        /* 이건 내가푼거

        // 시
        if (hour > 12) {
            System.out.print("오후 " + (hour - 12) + "시 ");
        } else if (hour == 12) {
            System.out.print("오후 " + hour + "시 ");
        } else if (hour == 11) {
            System.out.print("오전 " + hour + "시 ");
        } else if (hour < 10) {
            System.out.print("오전 " + "0" + hour + "시 ");
        }

        // 분
        if (min < 10) {
            System.out.print("0" + min + "분 ");
        } else {
            System.out.print(min + "분 ");
        }

        // 초
        if (sec < 10) {
            System.out.print("0" + sec + "초");
        } else {
            System.out.print(sec + "초");

         */
        }
    }

