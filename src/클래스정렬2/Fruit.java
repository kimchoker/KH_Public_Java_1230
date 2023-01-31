package 클래스정렬2;

import java.util.Comparator;

public class Fruit {
    String name;
    int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }
}


class DescendingComp implements Comparator<Fruit> {

    @Override
    public int compare(Fruit o1, Fruit o2) {
       if(o1.price < o2.price) return 1; // 큰 경우에 자리를 뒤바꾸기 때문에 내림차순 정렬이 됨
        return -1;
    }
}

class AscendingComp implements Comparator<Fruit> {

    @Override
    public int compare(Fruit o1, Fruit o2) {
        if (o1.price > o2.price) return 1; // 작은 경우에 자리를 뒤바꾸기 때문에 오름차순 정렬이 됨
        return -1;
    }
}