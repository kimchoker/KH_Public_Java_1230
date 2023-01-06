package 최댓값최솟값구하기;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

// 정수를 입력받음 (배열의 갯수)
// 입력받은 정수의 크기만큼의 배열 생성
// 배열의 크기만큼 순회하면서 임의의 정수 값을 입력
// 입력받은 배열에서 최소값과 최대값 출력
// ex) 정수값 : 10
// 1 3 4 5 6 7 5 7 8 10
// 입력받은 정수 중 Min값과 Max 값을 찾아 출력하는 것

// 스캐너를 생성
// 정수값을 입력받기
// 입력받은 정수 값으로 배열을 생성
// 생성된 배열의 크기만큼 순회하면서 임의의 정수를 입력받기
// 최솟값, 최댓값을 구하기 위해 배열의 첫번째 값을 대입
// 반복문을 순회하면서 최소값과 최대값을 구하기
// 결과를 출력
public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요 : ");

        int num = sc.nextInt();
        int[] a = new int[num];

        while (true) {


            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            // 최소, 최대값을 구하기 위해 배열의 첫번째 값 대입
            int min = a[0];
            int max = a[0];
            // 반복문을 순회하면서 최소값과 최대값 찾기

//            for(int e : a) {
//                if(min > e) min = e;
//                if(max < e) max = e;

            for(int i = 0; i < a.length; i++) {
                if(min > a[i]) min = a[i];
                if(max > a[i]) max = a[i];


            }


            System.out.println("최소값 : " + min );
            System.out.println("최대값 : " + max );
        }

    }
}

