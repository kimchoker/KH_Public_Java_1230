package 반복문기본;

import java.util.Scanner;

public class WhileBasic {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int number = sc.nextInt();
        while(number > 0) {
            sum += number; //sum = sum + number;
            number--;
        }
        System.out.println("입력받은 정수의 합은 " + sum + "입니다.");
    }
}



