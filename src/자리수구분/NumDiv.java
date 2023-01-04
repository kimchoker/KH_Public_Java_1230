package 자리수구분;

import java.util.Scanner;

// 100의자리 수를 입력받아 3개의 변수(100의 자리/10의 자리/1의 자리)에 나누어 담기
// 365를 입력받는 경우
// a라는 변수에는 3 b에는 6 c에는 5
public class NumDiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세 자리 정수를 입력하세요 : ");

        int number = sc.nextInt();

        int a, b, c;

        a = number / 100;
        b = (number % 100)/10;
        c = ((number % 100)%10);       // c = number % 10 강사님은 이렇게 하심 이게 더 간단한듯

        System.out.println("100의 자리는 " + a +  ", 10의 자리는 " + b + ", 1의 자리는 " + c + "입니다.");

    }
}
