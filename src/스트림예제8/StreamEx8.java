package 스트림예제8;

import java.util.ArrayList;
import java.util.List;

// 스트림에서 제공되는 메소드를 이용해 조건문과 반복문 없이 일관된 방식으로 처리하기
public class StreamEx8 {
    public static void main(String[] args) {
        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(new TravelCustomer("준혁", 27, 1000));
        customerList.add(new TravelCustomer("경연", 23, 5000));
        customerList.add(new TravelCustomer("연준", 24, 6000));
        customerList.add(new TravelCustomer("영웅", 27, 8000));
        System.out.println("==== 고객 명단 출력 ====");
        customerList.stream().map(TravelCustomer::getName).forEach(System.out::println);
        int total = customerList.stream().mapToInt(TravelCustomer::getPrice).sum();
        System.out.println("총 여행 비용 : " + total);
        System.out.println("==== 20세 이상 명단 출력 ====");
        customerList.stream()
                .filter(c->c.getAge() >= 20)
                .map(TravelCustomer::getName)
                .sorted()
                .forEach(System.out::println);
    }
}

class TravelCustomer {
    private String name;
    private int age;
    private int price;

    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }
}