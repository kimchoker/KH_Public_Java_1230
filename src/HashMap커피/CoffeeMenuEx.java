package HashMap커피;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// HashMap :  키와 값의 pair(쌍)으로 구성된 형태
// 동일 여부의 판단을 HashCode 를 통해서 판별.
// 키는 중복 불가 / 값은 중복 허용
// 순서를 보장하지 않는다.
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
                    for(String e : map.keySet()) { // 키 값을 기준으로 향상도니 for 문을 반복 수행
                        System.out.println("메뉴 : " + map.get(e).name); // 키로 해당하는 값을 얻어냄
                        System.out.println("가격 : " + map.get(e).price);
                        System.out.println("분류 : " + map.get(e).group);
                        System.out.println("설명 : " + map.get(e).desc);
                        System.out.println("===============================");
                    }
                    break;
                case 2:
                    System.out.println("조회할 메뉴를 입력하세요");
                    key = sc.next();
                    if(map.containsKey(key)) { // 매개변수로 전달된 키가 Map 내에 존재하는지 확인
                        System.out.println("메뉴 : " + map.get(key).name);
                        System.out.println("가격 : " + map.get(key).price);
                        System.out.println("분류 : " + map.get(key).group);
                        System.out.println("설명 : " + map.get(key).desc);
                    } else System.out.println("해당 메뉴는 존재하지 않는 메뉴입니다.");
                    break;
                case 3:
                    System.out.print("추가할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.print("이미 존재하는 메뉴입니다.");
                    } else {
                        System.out.print("가격 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 : ");
                        String group = sc.next();
                        sc.nextLine();
                        System.out.print("설명 : ");
                        String desc = sc.next();
                        map.put(key, new MenuInfo(key, price, group, desc)); // 키와 값(객체)을 추가함
                    }
                    break;
                case 4:
                    System.out.print("삭제할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) { // 삭제할 메뉴에 대한 키가 있으면 삭제
                        map.remove(key); // 키로 해당하는 맵을 entry 제거
                        System.out.println(key + "를 삭제했습니다.");
                    } else {
                        System.out.println("삭제할 메뉴가 없습니다.");
                    }
                    break;
                case 5:
                    System.out.print("수정할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String group = sc.next();
                        sc.nextLine(); // 버퍼 비우기
                        System.out.print("설명 입력 : ");
                        String desc = sc.nextLine();
                        map.replace(key, new MenuInfo(key, price, group, desc));
                    } else {
                        System.out.println("수정할 메뉴가 없습니다.");
                    }
                    break;
                case 6:
                    System.out.println("메뉴를 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 메뉴입니다. 메뉴를 다시 선택하세요");
            }
        }
    }
}