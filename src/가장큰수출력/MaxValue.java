package 가장큰수출력;

import java.util.Scanner;

// 세자리 정수를 입력받아 가장 큰 수를 출력
public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("세 자리 수를 입력하세요.");

        int number = sc.nextInt();
        int a, b, c;
        a = number / 100;
        b = (number%100) / 10;
        c = number % 10;
        if(number>999) {
            System.out.println("세 자리 숫자만 입력해 주세요");
        }
        else if(a > b && a > c) {
            System.out.println(a + "가 가장 큰 수 입니다.");
        } else if (b > a && b > c) {
            System.out.println(b + "가 가장 큰 수 입니다.");
        } else if (c > a && c > b) {
            System.out.println(c + "가 가장 큰 수 입니다.");
        }
        else
            System.out.println("결과를 구할 수 없습니다.");
    }
}
