package 조건문1;

import java.util.Scanner;

// if(조건식){조건식이 참인 경우}
// else if
// else

public class ConditionEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 키 입력을 받기 위해 스캐너 객체를 생성
        System.out.print("정수를 입력하세요 : ");
        int number = sc.nextInt(); // 키보드 입력을 정수형 변수에 대입
        if (number > 100) {
            System.out.println(number + " 은(는) 100보다 큰 수 입니다.");
        } else if (number < 100) {
            System.out.println(number + " 은(는) 100보다 작은 수 입니다.");
        } else {
            System.out.println(number + "은(는) 100과 같습니다.");

        }

    }

}

