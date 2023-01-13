package 전자레인지;

import java.util.Scanner;

// 3개의 시간조절용 버튼 A, B, C 가 달려있음
// A 버튼은 5분 B 버튼은 1분 C 버튼은 10초 단위로 시간이 오름
// 예를들어 요리시간이 100초가 소요된다면 B버튼 1번 C버튼 4번 -> T = 014
// 단, 시간은 10초 단위
// 3개의 버튼으로 시간을 맞출 수 없는 경우 -1을 출력
public class MicrowaveEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시간을 입력하세요");
        int a = 300;
        int b = 60;
        int c = 10;
            int time = sc.nextInt();
            if (time % 10 != 0) {
                System.out.println(-1);
                return;
            }
            int ab = time / a;
            int leftTime = time % a;
            int bb = leftTime / b;
            int leftTime2 = leftTime % b;
            int cb = leftTime2 / c;
            System.out.println("버튼을 눌러야 하는 횟수는  A: " + ab + " B: " + bb + " C: " + cb);

        }
    }
