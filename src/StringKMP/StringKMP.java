package StringKMP;

import java.util.Scanner;

// 입력 : Knuth-Morris-Pratt
// 출력 : KMP
// 입력 : Mirko-Slavko
// 출력 : MS
// 첫번째 방법 : split() 메소드를 이용하는 방법
// 두번째 방법 : charAt() 메소드를  이용하여 대문자만 출력하는 방법
// 세번째 방법 : 0번째 문자를 출력하고 '-'이후 문자를 출력하는 방법
// 네번째 방법 : 문자 배열로 변경 후 출력하기
public class StringKMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====이름을 입력하세요=====");
        String name = sc.next();

        // 첫번째 방법 : split() 메소드를 이용하는 방법
        String[] split = name.split("-");

        /* for(String e : split) {
             System.out.print(e.charAt(0));
              } 으로 바꿀 수 있음 */

        for(int i = 0; i < split.length; i++) {
            System.out.print(split[i].substring(0, 1));
        }
        // 두번째 방법 : charAt() 메소드를  이용하여 대문자만 출력하는 방법
        /* for(int i = 0; i < split.length; i++) {
                if(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
                System.out.print(name.chatAt(i));
                }
        }
        */

    }
    // 세번째 방법 : 0번째 문자를 출력하고 '-'이후 문자를 출력하는 방법
    /* for(int i = 0; i < split.length; i++) {
            if(i == 0) System.out.print(name.charAt(i));
            else {
                if(name.charAt(i) == '-') System.out.print(name.charAt(i+1));
           }
       }
    */

    // 네번째 방법 : 문자 배열로 변경 후 출력하기
    /* char[] chName = name.toCharArray();
        for(char e :chName) {
            if(e >= 'A' && e<= 'Z') System.out.print(e);
            }
    */
}
