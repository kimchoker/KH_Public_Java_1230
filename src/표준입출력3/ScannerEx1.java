package 표준입출력3;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner  객체 생성 - 정적 메소드가 아니기 때문에 객체 생성이 필요함
        byte b = sc.nextByte();              // 키보드에서 입력받은 결과를 byte 형으로 반환한다.
        short s = sc.nextShort();            // short 형으로 반환
        int i = sc.nextInt();                // int 형으로 반환
        long l = sc.nextLong();              // long 형으로 변환
        char ch = sc.next().charAt(0);       // 문자열에서 첫번째 문자를 추출하여 반환한다.

        String s1 =  sc.next();              // 문자열을 공백 기준으로 입력 받는다.
        String s2 = sc.nextLine();           // 공백은 상관하지 않고 줄바꿈을 기준으로 줄바꿈까지 입력 받는다.
        
    }
}
