package HashMap커피;

import 클래스정렬연습문제.grade;

import java.util.Comparator;

public class MenuInfo {
    String name; // 메뉴이름
    int price; // 메뉴가격
    String group; // 메뉴 카테고리
    String desc; // 메뉴 설명

    public MenuInfo(String name, int price, String group, String desc) {
        this.name = name;
        this.price = price;
        this.group = group;
        this.desc = desc;
    }
}

class SortMenu implements Comparator<MenuInfo> {
    @Override
    public int compare(MenuInfo o1, MenuInfo o2) {
        return o1.price -= o2.price;
    }
}