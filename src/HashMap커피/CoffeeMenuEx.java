package HashMap커피;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeMenuEx {
    Map<String, MenuInfo> map = new HashMap<>();

    public static void main(String[] args) {
        CoffeeMenuEx coffee = new CoffeeMenuEx();
        coffee.makeMenu();
        coffee.selectMenu();
    }

    void makeMenu() {
        map.put("Americano", new MenuInfo("Americano", 1500, "Coffee", "아메리카노~"));
        map.put("espresso", new MenuInfo("espresso", 4000, "Coffee", "진한 커피"));
        map.put("Lemonade", new MenuInfo("lemonade", 4300, "non-coffee", "상큼한 레몬에이드"));
        map.put("Latte", new MenuInfo("latte", 4500, "coffee", "부드러운 라떼"));

    }

    void selectMenu() {
        Scanner sc = new Scanner(System.in);
        String key = "";
        while (true) {
            System.out.print("[1]메뉴 보기 [2]메뉴 조회 [3]메뉴 추가 [4]메뉴 삭제 [5]메뉴 수정 [6]종료 : ");
            int selMenu = sc.nextInt();

            switch (selMenu) {
                case 1:
                    System.out.println("========== 메뉴보기 ==========");
                    for(String e : map.keySet()) {
                        System.out.println("메뉴 : " + map.get(e).name);
                        System.out.println("가격 : " + map.get(e).price);
                        System.out.println("분류 : " + map.get(e).group);
                        System.out.println("설명 : " + map.get(e).desc);
                        System.out.println("===============================");
                    }
                    break;
                case 2:
                    System.out.println("조회할 메뉴를 입력하세요");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.println("메뉴 : " + map.get(key).name);
                        System.out.println("가격 : " + map.get(key).price);
                        System.out.println("분류 : " + map.get(key).group);
                        System.out.println("설명 : " + map.get(key).desc);
                    } else System.out.println("해당 메뉴는 존재하지 않는 메뉴입니다.");
                    break;
                case 3:
                    System.out.print("추가할 메뉴를 입력하세요 : ");
                    key = sc.nextLine();
                    if(map.containsKey(key)) {
                        System.out.print("이미 존재하는 메뉴입니다.");
                    } else {
                        System.out.print("가격 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 : ");
                        String group = sc.nextLine();
                        System.out.print("설명 : ");
                        String desc = sc.nextLine();
                        map.put(key, new MenuInfo(key, price, group, desc));
                    }
                    break;
                case 4:
                case 5:
                case 6:
                    System.out.println("메뉴를 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 메뉴입니다. 메뉴를 다시 선택하세요");
            }
        }
    }
}