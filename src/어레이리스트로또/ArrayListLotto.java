package 어레이리스트로또;

import java.util.ArrayList;
import java.util.List;

// ArrayList를 활용해 중복된 번호를 제거하여 로또를 만드는 방법

public class ArrayListLotto {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();     // AtrrayList는 배열과 다르게 크기를 지정할 필요가 없다
        int tmp;    // tmp는 로또 번호를 생성해 임시 저장하는 변수

        while (true) {
            tmp = (int) ((Math.random() * 45) + 1);      // 1~45 사이의 랜덤한 숫자를 생성
            if (!list.contains(tmp)) { // list 내에 tmp의 숫자가 포함되어있지 않냐를 묻는 것 ! =  부정 연산자 list.contains(tmp) ==false와 같은 뜻
                list.add(tmp);
            }
            if (list.size() == 6) break;
        }
        for (int e : list) System.out.print(e + " ");
    }
}


