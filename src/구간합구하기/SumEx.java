package 구간합구하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();  // N
        int sumCnt = sc.nextInt(); // M

        List<Integer> numList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int[] rstArr = new int[sumCnt];
        for (int i = 0; i < num; i++) {
            numList.add(sc.nextInt());
        }
        for(int i = 0; i < sumCnt; i ++){
            int sum = 0;
            list.clear();
            list.add(sc.nextInt());
            list.add(sc.nextInt());

            for (int l = list.get(0)-1; l < list.get(1); l++) {
                sum = sum + numList.get(l);
            }
            rstArr[i] = sum;
        }
        System.out.println(Arrays.toString(rstArr));
    }
}

