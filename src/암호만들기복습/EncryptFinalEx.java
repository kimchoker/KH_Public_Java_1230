package 암호만들기복습;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 평문을 입력 :
// 암호키 :
// 결과문구 :
public class EncryptFinalEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("평문 : ");
        String normal = sc.nextLine();
        System.out.print("암호문 : ");
        String encrypt = sc.next(); // 암호문구는 계속 반복되어야 함(평문 길이만큼 반복)
        char[] enc = encrypt.toCharArray(); // 문자열을 문자 배열로 변경
        char value = 0;
        List<Character> vig = new ArrayList<>();

        for(int i = 0; i < normal.length(); i++) { // 평문의 길이만큼 순회
            if (normal.charAt(i) == ' ') vig.add(' '); // 공백인 경우는 그냥 공백을 추가
            else {
                value = (char) (normal.charAt(i) - enc[i % encrypt.length()] - 'a');
                if (value < 'a') value += 26;
                vig.add(value);
            }
        }
        for (Character e : vig) System.out.print(e);
    }
}
