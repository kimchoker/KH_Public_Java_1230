package 대소문자변경;

import java.util.Scanner;

// 입력 받은 문자열에서 대문자는 소문자로 소문자는 대문자로 변경하기
// toUpperCase = TOuPPERcASE
// 힌트 1 : 문자열에서 특정 문자를 추출하는 방법은 charAt(인덱스)
// 힌트 2 : 문자는 내부적으로 정수값으로 간주되어 사용된다.
// 힌트 3 : 값을 출력할때는 정수값이 아닌 문자로 표현하기 위해서는 형변환이 필요
public class UpperLowerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== 문자열을 입력하세요 ===");
        String str = sc.next();
        char ch; // 문자열이 인덱스에 해당하는 문자를 담을 변수

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); // 문자열에 해당 인덱스 문자 추출
            if(ch < 'a') System.out.print((char) (ch + ('a' - 'A')));
            else System.out.print((char) (ch - ('a' - 'A')));



        }
    }
}
