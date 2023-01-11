package PC방알바;

import java.util.Scanner;

// 피씨방에는 피씨가 100대 있습니다.
// 손님은 자신이 원하는 피씨를 사용하고 싶어합니다.
// 손님의 수 입력 : 5
// 손님이 선택한 좌석 번호 : 1 1 3 3 5 => 2
// 거절 횟수 : 2
public class PcRoomEx {
    public static void main(String[] args) {
        int pcRoom[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("손님의 수를 입력하세요");
        int n = sc.nextInt(); // 손님의 수 입력
        int rejectCnt = 0; // 거절 횟수를 누적하는 변수
        System.out.println("좌석번호를 입력하세요");
        for(int i = 0; i < n; i++) { // 입력받은 손님의 수만큼 좌석번호를 입력받음
            int seatNum = sc.nextInt(); // 각 손님의 좌석 번호를 입력받음
            if(pcRoom[seatNum-1] == 1) rejectCnt++;
            else pcRoom[seatNum-1] = 1;

        }
        System.out.println("중복된 좌석의 갯수는" + rejectCnt);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("손님의 수를 입력하세요");
//        int per = sc.nextInt();
//        int cnt = 0;
//        System.out.println("선택할 좌석을 입력해주세요");
//        String seatnum = sc.next();
//        String[] result = seatnum.split(" ");
//        for(int i = 0; i < seatnum.length(); i++) {
//            if(result[i] == result[i]){
//                cnt++;
//            } else seat[i] = (Integer.parseInt(result[i]));
//            System.out.println(cnt);
//        }
    }
}
