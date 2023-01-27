package 배수찾기;

import java.util.ArrayList;
import java.util.Scanner;

// 첫번째 숫자 들어간 n에 대한 배수인지 알아보는 문제
// 첫번째로 기본값을 입력
// 연속으로 값을 입력받기 (ArrayList 로 입력받은 값을 저장)
// 입력값이 0이면 종료
// 입력 받기를 종료한 후 List 내에 있는 값이 주어진 값의 배수인지 아닌지 확인해 줄력
// ex) 처음 들어간 비교값이 3
//
public class MultipleGetEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("수를 입력하세요");
        ArrayList<Integer> mtp = new ArrayList<>();
        while (true) {
            int num = sc.nextInt();
            if(num == 0) break;
            else mtp.add(num);

        }
        for(int i = 1; i < mtp.toArray().length; i++) {
            if(mtp.get(i) % mtp.get(0) == 0) {
                System.out.println(mtp.get(i) + " is multiple of " + mtp.get(0) + ".");
            } else System.out.println(mtp.get(i) + " is NOT multiple of " + mtp.get(0) + ".");
        }
    }
}
