package 윤년구하기;

import java.util.Scanner;

// 연도가 4로 나누어지면 윤년이다.
// 100으로 나누어 떨어지면 윤년이 아님
// 400으로 나누어지면 윤년임
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("연도를 입력하세요 : ");

        int year = sc.nextInt(); // 키보드로부터 연도를 입력받음
        if ((year % 4 == 0) && ((year % 100 !=0) || (year % 400 ==0))) {
            // 참인 경우 수행
            System.out.println(year + "년은 윤년입니다.");
        } else {
            //거짓인 경우 수행
            System.out.println(year + "년은 윤년이 아닙니다.");
        }
    }
}