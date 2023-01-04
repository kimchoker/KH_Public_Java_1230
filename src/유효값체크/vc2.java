package 유효값체크;

import java.util.Scanner;

public class vc2 {
        public static void main(String[] args) {
            int age;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.print("나이를 입력하세요 : ");
                age = sc.nextInt();
            } while (age <= 0 || age >= 200);

            System.out.println("당신의 나이는 " + age + "입니다.");

        }


}
