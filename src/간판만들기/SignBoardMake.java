package 간판만들기;

import java.util.Scanner;

// 임의의 숫자를 입력받음 : 120
// 120에 대한 차지하는 공간을 계산하는 것
// 0은 4칸, 1은 2칸, 그 외 나머지는 3칸을 차지
// 120 ==> 1 + 2 + 1 + 3 + 1 + 4 + 1 => 13
// 5611 =>
// 0이 입력되기 전까지는 반복 수행해야 함
// 못풀었음 ㅋㅋ
public class SignBoardMake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
    }
}
       /* char[]
        int i;
        int inum;
        int sum = 0;

        while (true) {
            String input = sc.next();
            if (cnum.equals('0')) break;
            cnum = input.toCharArray();
            for (i = 0; i < cnum.length; i++) {
                if (cnum[i] == '0') {
                    cnum[i] = (int) '4' - '0';
                } else if (cnum[i] == '1') {
                    cnum[i] = (int) '2' - '0';
                } else cnum[i] = (int) '3' - '0';

                sum = sum + (int) cnum[i];
                System.out.println(sum);
                if (i == cnum.length) break;
            }

        }
    }
}

*/