package switch문Ex;
// switch 문은 조건값에 따라 분기할 수 있으며, 조건값은 정수, 문자, 문자열이 올 수 있음. (실수값은 못옴 명확한 값이 아니기 때문)
// 자바는 문자열도 올 수 있음 c언어는 못옴

import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("계절을 입력하세요 : ");
        String season = sc.next();
        switch(season) {
            case "spring" :         // 해당하는 조건이 실행 됨
                System.out.println("봄");
                break;              // 해당 조건을 종료
            case "summer" :
                System.out.println("여름");
                break;
            case "autumn" :
            case "fall" :
                System.out.println("가을");
                break;
            case "winter" :
                System.out.println("겨울");
                break;
            default :
                System.out.println("잘못된 문자입니다.");
        }
    }
}
