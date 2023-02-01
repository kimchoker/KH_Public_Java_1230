package 숫자의합;

import java.util.Scanner;

// 문제 : n개의 숫자가 공백없이 쓰여 있음. 이 숫자를 모두 합해서 출력하는 문제
//
public class SumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.next();
            int sum = 0;
            if (input.equals("0000")) break;
            else {
                char[] inputarr = input.toCharArray();
                for (int i = 0; i < input.length(); i++) {
                    sum = sum + Character.getNumericValue(inputarr[i]);
                }
                System.out.println(sum);
            }
        }
    }
}