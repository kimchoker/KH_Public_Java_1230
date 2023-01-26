package 로또번호만들기응용;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// 7자리의 로또 번호를 만들기
// 첫번째부터 여섯번째 숫자는 0과 50 사이의 랜덤 값
// 마지막 보너스 숫자는 50~100 사이의 임의의 숫자
// 배열을 사용하여 값을 구하고 출력하기. 단 중복은 허용함
public class LottoApplyEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int[] lotto = new int[7];
            Random random = new Random();
            for (int i = 0; i < 6; i++) {
                lotto[i] = ((int) (Math.random() * 100));
                if (lotto[i] > 50) lotto[i] = lotto[i] - 50;
            // ((int) (Math.random() * 51)) 로 구현하면 한줄로 줄일 수 있음
            }
            lotto[6] = ((int) (Math.random() * 100));
            if (lotto[6] < 50) lotto[6] = lotto[6] + 50;
            // ((int) (Math.random() * 51) + 50) 로 구현하면 한줄로 줄일 수 있음
            System.out.println(Arrays.toString(lotto));
            System.out.println("번호를 재생성하시겠습니까? [1] Y [2] N");
            int reset = sc.nextInt();
            if(reset == 1) continue;
            else return;
        }
    }
}
