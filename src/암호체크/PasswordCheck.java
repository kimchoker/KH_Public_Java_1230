package 암호체크;
// 암호의 길이는 10~30자 사이로 설정 (10 <= length <=30)
// 암호에는 숫자, 소문자, 대문자, 특수문자가 포함되어야 함
// 특수문자는  ! % _ # & + - * / 의 9개 중 하나여야 함
// 입력받은 패스워드가 조건을 만족하면 Good Password, 만족하지 않으면 Bad Password 출력
// 반복문을 사용하고 사용자가 "종료" 또는 "exit" 를 입력하면 프로그램 종료

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("암호를 입력하세요");
            String password = sc.next();
            if (password.equalsIgnoreCase("exit") || password.equalsIgnoreCase("종료")) return;

            if (password.length() < 10 || password.length() > 30) {
                System.out.println("길이");
            } else {
                for (int i = 0; i < password.length(); i++) {
                    int num = password.charAt(i);

                    if (num == 33 || num == 35 || num == 37 || num == 38 || num == 42 || num == 43 || num == 45 || num == 47 || num == 95) {
                    }
                    else if (i == password.length() - 1) {
                        System.out.println("특문 없음");
                    }
                    if (num >= 'A' && num <= 'Z') /* 대문자 */ {
                    } else System.out.println("대문자 없음");
                    if (num >= 'a' && 'z' >= num) /* 소문자 */ {
                    } else System.out.println("소문자 없음");
                    if ('1' <= num && '9' >= num) /* 숫자 */ {
                        System.out.println("Good Password");
                    } else System.out.println("숫자 없음");

                }
            }
        }
    }
}