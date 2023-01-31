package 암호;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PasswordEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("암호화 키를 입력하세요");
        String encrypt = sc.next();
        System.out.println("암호화할 문장을 입력하세요");
        String normal = sc.nextLine();
        char[] enc = encrypt.toCharArray(); // 입력받은 문자열을 문자 배열로 변환
        char value = 0;
        List<Character> vig = new ArrayList<>();

        for(int i = 0; i < normal.length(); i++) {
            if(normal.charAt(i) == ' ') vig.add(' '); // 공백인 경우 공백 처리
            else {
                value = (char) (normal.charAt(i) - (enc[i % encrypt.length()] - 'a') -1);
                if(value < 'a') value += 26;
                vig.add(value);
            }
        }
        for (Character e : vig) System.out.println(e);
    }
}
