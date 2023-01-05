package 중복없는로또번호생성;
// 중복없는 로또 번호 생성하기
// 1. 6개의 로또 번호 생성하여 출력하기 로또 번호는 1~45번까지(배열 사용)
// 2. 중복 없는 로또 번호 생성 후 출력
// 3. ArrayList를 이용하여 코드 간소화하여 출력 (중복 없음)
// 4. Set을 이용해서 로또 번호 출력
// 6개의 배열 생성
// 반복문을 순회하면서 랜덤함수를 이용해 배열에 로또번호를 추가
// 마지막에 배열에 포함된 로또 번호 출력

import java.util.Arrays;

//타입[] 배열이름 = new 타입[배열의 길이]
public class LottoEx1 {
    public static void main(String[] args) {
        int[] lottery = new int[6];
        int tmp, index = 0;
        boolean isExist = false; // 로또 배열에 지금 생성된 숫자와 같은 숫자가 존재하는가

        while (true){
             tmp = (int) ((Math.random() * 45) + 1);
             for(int i = 0; i < lottery.length; i++) {
                 if(lottery[i] == tmp) isExist = true;
             }
                if(isExist == false) lottery[index++] = tmp; // 해당 인덱스에 값을 반영하고 증가시킴

                if (index == 6) break;
                isExist = false;


    }
        System.out.print(Arrays.toString(lottery));
    }

}
