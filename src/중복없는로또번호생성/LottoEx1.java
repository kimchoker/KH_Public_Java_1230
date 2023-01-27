package 중복없는로또번호생성;
// 중복없는 로또 번호 생성하기
// 1. 6개의 로또 번호 생성하여 출력하기 로또 번호는 1~45번까지(배열 사용)
// 2. 중복 없는 로또 번호 생성 후 출력
// 3. ArrayList를 이용하여 코드 간소화하여 출력 (중복 없음)
// 4. Set을 이용해서 로또 번호 출력
// 6개의 배열 생성
// 반복문을 순회하면서 랜덤함수를 이용해 배열에 로또번호를 추가
// 마지막에 배열에 포함된 로또 번호 출력

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//타입[] 배열이름 = new 타입[배열의 길이]
public class LottoEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lottery = new ArrayList<>();
        int tmp, index = 0;
        for (int i = 0; i < 6; i++) {
            tmp = (int) ((Math.random() * 45) + 1);
            if (!lottery.contains(tmp)) lottery.add(tmp);
            if (lottery.size() == 6) break;
        }
        System.out.println(lottery);
    }
}
