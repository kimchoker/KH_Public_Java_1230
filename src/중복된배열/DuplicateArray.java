package 중복된배열;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

// 10개의 배열을 만들고 임의의 숫자를 입력받음 (가급적 중복된 숫자가 있도록 입력)123456123
// 중복된 문자 중 두번째 나오는 숫자의 위치 찾기 위치는 인덱스가 아닌 실질적인 위치를 의미
// 임의의 숫자 입력 (10개) 1 2 3 4 5 1 2 3 4 5
// 찾을 숫자 : 5
// 결과 : 10
public class DuplicateArray {
    public static void main(String[] args) {
        int[] box = new int[10];
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 10개를 입력하세요");
        for (int i = 0; i < 10; i++) {
            box[i] = sc.nextInt();
        }
        System.out.println("찾을 숫자를 입력하세요");
        int find = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if (box[i] == find) {
                cnt++;
                if (cnt == 2) {
                    System.out.println(i + 1);
                    break;
                }
            }

        }
    }
}
