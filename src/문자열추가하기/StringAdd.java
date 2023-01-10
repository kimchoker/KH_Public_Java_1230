package 문자열추가하기;
// 두 개의 문자열을 입력받고 정수 n 값을 입력받음
// 첫 번째 문자열 입력 : seoul
// 두 번째 문자열 입력 : korea
// 정수값 입력 : 2
// ulkorea
// 첫번째 문자열 뒷 부분의 n개 문자열을 두번째 문자열 앞에 끼워넣기


import java.util.Scanner;

public class StringAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 문자열을 입력하세요");
        String first = sc.next();
        System.out.println("두번째 문자열을 입력하세요");
        String second = sc.next();
        System.out.println("정수를 입력하세요");
        int num = sc.nextInt();

        System.out.print(first.substring((first.length() - num)));
        System.out.print(second);


    }
}
