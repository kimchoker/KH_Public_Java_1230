package 소수판별하기;

import java.util.Scanner;

// 메소드를 이용한 소수 판별하기
// 1과 자기자신 이외에는 나누어지지 않는 수
// 정수를 입력받아 해당 정수 미만의 소수를 찾아 합을 구하는 문제
// 12를 입력했을 경우 : 3 5 7 11
public class PrimeEx1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력 : ");
        int num = sc.nextInt();
        int sum = 0; // 소수의 합을 누적
        for (int i = 2; i <= num; i++) sum += primeSum(i);
                System.out.println("소수의 합 : " + sum);
    }
    static int primeSum(int n) {
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) isPrime = false;
        }
        if(isPrime) return n; /* 해당 값이 소수이면 입력받은 값을 반환 */
        else return 0; /* 소수가 아니면 0 반환 */

    }
}

