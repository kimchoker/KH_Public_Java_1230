package 진수변환파이널;

import java.util.Scanner;

public class DecToBinFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("십진수 입력 : ");
        int val = sc.nextInt();
        val = decToBin(val);
        System.out.print("이진수 : " + val);
        System.out.println();
        val = binToDec(val);
        System.out.print("십진수 : " + val);
    }
    // 함수의 결과가 2진수 형태로 보이긴 하지만 실제로는 2진수가 아님
    static int decToBin(int dec) {
        int bin = 0;
        int tmp = 0; // 계산 결과를 임시로 담아둘 변수
        int pos = 1; // 포지션(자리수)
        while (dec != 0) {
            tmp = dec % 2;
            bin = bin + tmp * pos; // tmp(값을 2로 나눈 값) * pos(자릿수를 곱해주는 것)
            dec = dec / 2;
            pos = pos * 10; // 한 번 돌때마다 자릿수가 하나씩 올라감 1 10 100 1000
        }
        return bin;
    }
    static int binToDec(int bin) {
        int dec = 0, i = 0, tmp = 0;

        while (bin != 0) {
            tmp = bin % 10;
            bin = bin / 10;
            dec += tmp * Math.pow(2, i++); // 2의 0승부터 한바퀴 돌때마다 2의 1승 2의 2승으로 늘어남
        }
        return dec;
    }
}
