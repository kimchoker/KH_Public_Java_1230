package StringTokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 / 기준으로 연속 입력하세요 : ");
        String names = sc.nextLine();
        String[] nameArr = names.split("/");
//        StringTokenizer st = new StringTokenizer(names, "/");
//        String[] nameStr = new String[st.countTokens()]; // 쪼개진 문자열의 갯수만큼 배열을 확보
//        int idx = 0;
//        while(st.hasMoreTokens()) {
//            nameStr[idx++] = st.nextToken();
//        }
         for(String e : nameArr) System.out.print(e + " ");
//    }
    }
}