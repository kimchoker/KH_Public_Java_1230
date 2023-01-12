package 클래스상수;

public class Animal {
    String name;
    void setName(String name) {
        this.name = name;
//    Animal(String name) {
//        this.name = name;
    }
}
// Animal 로부터 상속을 받아 클래스를 생성
class Dog extends Animal {
    void sleep() {
        System.out.println(name + "잠을 잡니다");
    }
}
class HouseDog extends Dog {
    @Override
    void sleep() { // 오버라이딩 관계가 만들어짐
        System.out.println(name + "오랫동안 잠을 잡니다");
    }
    void sleep(int hour) {
        System.out.println(name + "가 "+ hour + "시간동안 잠을 잡니다");
    }
}