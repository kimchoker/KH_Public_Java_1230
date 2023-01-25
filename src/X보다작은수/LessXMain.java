package X보다작은수;

import java.util.Scanner;

// 첫째줄에 N과 X가 주어짐
// 둘째줄에 수열 A를 이루는 정수 N개가 주어진다
// 주어지는 정수는 모두 1보다 크거나 같고, 10000보다 작거나 같은 정수이다
// 10 5 > 배열의 갯수와 찾을 수를 연속하여 입력
// 1 10 4 0 2 3 8 5 7 6
// 1 4 2 3
public class LessXMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 길이를 입력하세요");
        int[] arr = new int[sc.nextInt()];
        System.out.println("기준이 되는 숫자를 입력하세요");
        int find = sc.nextInt();
        System.out.println("배열의 숫자를 입력하세요");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < find) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}