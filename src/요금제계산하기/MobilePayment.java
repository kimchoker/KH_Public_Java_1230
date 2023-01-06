package 요금제계산하기;

import java.util.Scanner;

// 영식 요금제 : 30초마다 10원씩 청구 (30초 미만이면 1통화, 30초부터 2통화)
// 민식 요금제 : 60초마다 15원씩 청구 (60초 미만이면 1통화, 60초부터 2통화)
// 통화 횟수 : 20회 미만 (배열 갯수를 20개 미만으로)
// 통화 시간 :
// 입력시에 어떤 요금제가 더 저렴한지 저렴한 요금제를 출력하고 총 요금을 계산하여 출력하기 (요금제 이름 : 총 통화요금 금액)
// 두 요금제의 가격이 같은 경우 (영식/민식 요금제 : 총 통화요금 금액)
public class MobilePayment {
    public static void main(String[] args) {
        int[] call = new int[20];
        int yPayTotal = 0, mPayTotal = 0;   // 총 요금을 위한 변수 생성
        Scanner sc = new Scanner(System.in);
        System.out.print("통화 횟수를 입력하세요 : ");
        int count = sc.nextInt();
        System.out.print("통화 시간을 입력하세요 : ");
        for (int i = 0; i < count; i++) {
            call[i] = sc.nextInt();
        }
        for (int i = 0; i < count; i++) {
            yPayTotal += (call[i] / 30) * 10 + 10;
            mPayTotal += (call[i] / 60) * 15 + 15;
        }
        System.out.println("민식 요금제 : " + mPayTotal);
        System.out.println("영식 요금제 : " + yPayTotal);


        if (yPayTotal > mPayTotal) {
            System.out.println(" 둘 중 저렴한 요금제는 민식 요금제, " +"요금은 "+ mPayTotal);
        } else if (yPayTotal < mPayTotal) {
            System.out.println("둘 중 저렴한 요금제는 영식 요금제, " +"요금은 " +yPayTotal);
        } else {
            System.out.println("영식/민식 요금제 : " + yPayTotal);

        }

    }
}

