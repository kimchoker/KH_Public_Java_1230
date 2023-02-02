package 진수변환;

import java.util.Scanner;

// 문제 : 8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오
// 입력 : 첫째줄에 8진수가 주어짐
// 출력 : 첫째줄에 주어진 8진수를 2진수로 변환하여 출력. 수가 0인 경우를 제외하고 반드시 1로 출력
// 314
// 11001100

// 첫째자리는 가면 안됨
// octarr의 길이보다 길어지면 안됨
// sample을 한번씩 다 집어넣어봐야 함
public class ConversionEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("8진수를 입력하세요");
        String oct = sc.next();
        char[] octarr = oct.toCharArray();
        int[] sample = {0, 1, 2, 3, 4, 5, 6, 7};
        String[] fBinary = {"000", "1", "10", "11", "100", "101", "110", "111"};
        String[] sBinary = {"000", "001", "010", "011", "100", "101", "110", "111"};

        for (int i = 0; i < 8; i++) {
            if (Character.getNumericValue(octarr[0]) == sample[i]) {
                System.out.print(fBinary[i]);
            }
        }
        for (int j = 1; j < octarr.length; j++) {
            for (int l = 0; l < 8; l++) {
                 if (Character.getNumericValue(octarr[j]) == sample[l]) {
                    System.out.print(sBinary[l]);
                }
            }
        }
    }
}