package 알람설정하기;

import java.util.Scanner;

// 상근이라는 친구가 있음 매일 학교를 지각함
// 창영이라는 친구가 상근에게 지각하지 않는 비법을 전수함
// 알람을 설정하면 자동으로 설정 시간보다 45분 일찍 알람이 설정됨
// 입력 시간은 시간과 분으로 입력 받기
// 입력 받은 시간에서 45분 이전에 알람을 울리도록 설정
// 시간은 24시간제

// 스캐너 생성
// 시간과 분을 정수값으로 입력받음
// 시간을 모두 분으로 일단 변환 후 계산이 필요
// 분으로 변경된 값에서 45를 빼고 결과를 시간과 분으로 환산
// 한가지 더 고려해야 할 사항은 45분을 뺀 결과가 0보다 작은 경우에 고려 필요
public class AlarmSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시간을 입력하세요.");
        int hour = sc.nextInt();
        System.out.println("분 을 입력하세요");
        int min = sc.nextInt();
        // 시간을 모두 분으로 변환 후 계산이 필요
        int calc = hour * 60 + min;
        // 45분을 뺀 결과가 0보다 작은 경우

        if(calc <45) {
            calc = (24 * 60) + min;
        }

        calc -= 45;
        // 분으로 변경된 값에서 45를 빼고 결과를 시간과 분으로 환산하여 결과 출력
        System.out.printf("%d시 %d분\n" , (calc / 60), (calc % 60));

    }
}
