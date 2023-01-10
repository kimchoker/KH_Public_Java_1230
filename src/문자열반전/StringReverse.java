package 문자열반전;
// abcdefg를 입력하면 gfedcba 로 출력하기
// 입력받은 문자를 역순으로 출력하기
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("알파벳을 입력하세요");
        String str = sc.next();

    /*    int index = str.length();
        while (index >=0 ) {
            index--; // 인덱스는 문자열 길이 - 1
            System.out.println(str.charAt(index));
        }
*/

        for (int i = str.length() - 1; i >= 0; i--) {

            System.out.print(str.charAt(i));
        }

    }
}
