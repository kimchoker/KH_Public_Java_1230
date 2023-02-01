package 피타고라스정리;

import java.util.*;

public class Pythagoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> tri = new ArrayList<>();
        System.out.println("삼각형의 세 변의 길이를 입력하세요");
        while (true) {
            int input1 = sc.nextInt();
            int input2 = sc.nextInt();
            int input3 = sc.nextInt();
            if (input1 + input2 + input3 == 0) break;
            else {
                tri.add(input1);
                tri.add(input2);
                tri.add(input3);
            }
            tri.sort(Comparator.naturalOrder());

            if (tri.get(0) * tri.get(0) + tri.get(1) * tri.get(1) == tri.get(2) * tri.get(2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
            tri.removeAll(tri);
        }
    }
}
