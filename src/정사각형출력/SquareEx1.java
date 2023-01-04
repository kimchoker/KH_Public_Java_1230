package 정사각형출력;

import java.util.Scanner;

// 양의 정수 n을 입력받아 n * n 크기의 행렬을 출력하는 프로그램
// 행렬의 값은 1부터 시작
public class SquareEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int n = sc.nextInt();
        int i = 1;
        for( ; ; ) { // for(int i = 1; i <= n * n; i++) 로 표시해도 됨
            System.out.printf("%4d", i);
            if (i % n == 0) System.out.println();
            if(i == n * n) break; // 조건식
            i++; //증가값
        }
    }
}
