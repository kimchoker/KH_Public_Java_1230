package 시험2;

import java.util.Scanner;

public class Overloading {
    public static void main(String[] args) {
        int num = 1;
        int x = num / 10; // 십의자리
        int y = num % 10; // 일의자리
        int sum = 0;
        int rst = 0;
        int cnt = 0; // 싸이클 횟수 계산을 위한 카운트
        if (num < 10) num = 10 * num; // 입력받은 수가 10보다 작은 경우 뒤에 0을 붙여주기
        sum = x + y; // 첫번째 계산
        while (true) {
            rst = y * 10 + sum % 10;
            cnt++;
            y = sum * 10;
            x = rst % 10;
            sum = y + x;
            if (sum == num) System.out.println(cnt);
            break;
        }
    }
}