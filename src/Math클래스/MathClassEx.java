package Math클래스;

import java.util.Random;

// Math클래스는 수학에서 자주 사용하는 상수들과 메소드를 미리 구현해놓은 클래스
// Math 클래스의 모든 메소드는 클래스 메소드 (static method) 입니다. 그러므로 객체 생성 불가.
// java.lang 에 포함된 클래스
public class MathClassEx {
    public static void main(String[] args) {
        // random() : 0.0이상 1.0미만의 범위에 있는 임의의 double형 값 생성
//        for (int i = 0; i < 100; i++) {
//            System.out.print((int) (Math.random() * 100) + 1 + " "); // 0~99 사이의 임의의 수 생성
//        }

        // 윗 방법을 많이 쓰고 아래 방법은 알면 좋은데 몰라도 ㄱㅊ
        Random random = new Random();
        System.out.println(random.nextInt(100));

        // 3 ~ 8 사이 임의의 수를 구하기
        System.out.println((int)(Math.random() + 6) + 3);

        // abs() : 절댓값을 구해주는 메소드. 입력이 음수인 경우 양수로 출력, 입력이 양수인 경우에도 양수로 출력
        System.out.println(Math.abs(-1556));
        System.out.println(Math.abs(10));
        System.out.println(Math.abs(-3.14));

        // floor() : 소수점 이하를 날리고 가장 가까운 정수값을 출력
        // ceil() : 소수점이 있으면 무조건 올림
        // round() : 소수점이 있으면 반올림
        System.out.println(Math.floor(9.494));
        System.out.println(Math.ceil(9.494));
        System.out.println(Math.round(9.494));

        // min() : 전달된 두 값 중 작은 값 출력
        // max() : 전달된 두 값 중 큰 값 출력
        System.out.println(Math.max(45, 10));
        System.out.println(Math.min(20, 80));
    }
}