package 다중for문;
// 별찍기 응용
// 정수 입력 받기 : 3
// *
// * *
// * * *


import java.util.Scanner;

public class DoubleForEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
