package 준혁킹;

import java.util.Scanner;

// 상근날드에는 3가지 햄버거와 2가지의 음료를 판매함
// 3가지 햄버거의 가격 중 가장 싼 메뉴의 가격을 선택하고, ,음료 중 가장 싼 메뉴의 가격을 선택
// 세트메뉴는 50원 할인됨
public class SetMenu {
    public static void main(String[] args) {
        int[] menu = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("준혁킹에 오신것을 환영합니다");
        System.out.println("=== 메뉴의 가격을 입력해주세요 ===");


        for (int i = 0; i < menu.length; i++) {
            menu[i] = sc.nextInt();
        }
        int ham = menu[0];
        int bev = menu[3];

//        for (int i = 0; i < 3; i++) {
//            if (ham > menu[i]) ham = menu[i];
//        }
//        for (int i = 3; i < 5; i++) {
//            if (bev > menu[i]) bev = menu[i];
//        } 이렇게 해도 됨 이건 내가푼거

        for(int i = 0; i < menu.length; i++) {
            if((i < 3) && (ham > menu[i])) ham = menu[i];
            if((i > 2) && (bev > menu[i])) bev = menu[i];

            // 이렇게 하면 for문 두번 돌리지 않고 한번에 해결 가능
            // 이건 강사님이 풀어준거

        }

        System.out.println(ham);
        System.out.println(bev);
        System.out.println(ham + bev - 50);
    }
}