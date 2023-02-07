package 블랙잭;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("카드의 장수를 입력하세요");
        int card = sc.nextInt();
        System.out.println("카드의 기준수를 입력하세요");
        int num = sc.nextInt();
        int sum = 0;
        if (card < 3 || card > 100) System.out.println("범위를 벗어난 장수 입력입니다.");
        if (num < 10 || num > 100000) System.out.println("범위를 벗어난 기준수입니다.");
        System.out.println("카드의 숫자를 입력하세요");
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < card; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                for (int k = j + 1; k < list.size(); k++) {
                    sum = list.get(i) + list.get(j) + list.get(k);
                    if (sum <= num) list2.add(sum);
                }
            }
        }
        list2.sort(Comparator.reverseOrder());
        System.out.println(list2.get(0));
    }
}