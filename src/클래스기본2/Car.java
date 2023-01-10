package 클래스기본2;

public class Car { // 클래스 이름은 대문자로 시작
    static String manufacturer; // 클래스 필드
    private String productName; // 인스턴스 필드
    String color; // 인스턴스 필드
    int maxSpeed; // 인스턴스 필드

    // 생성자는 클래스 이름과 동일하고 반환 타입이 없음. void 도 없음
    // 생성자는 클래스가 객체로 만들어질 때 호출됨. 생성자를 만들지 않으면 보이지 않는 생성자가 호출됨
    // 생성자는 여러 개를 만들어 필요에 따라 적절한 생성자를 호출할 수 있다. (생성사 오버로딩)
    // 생성자의 매개변수는 클래스를 객체로 만드는 위치에서 전달함
    // 생성자의 목적은 클래스가 객체로 만들어 질 때 해당 인스턴스 필드를 초기화 하는 것
    Car() {
        productName = "이름없는 차";
        color = "색상x";
        maxSpeed = 0;
    }
    Car(String name, String color, int speed) {
        productName = name;
        this.color = color;
        // 매개변수로 전달된 변수와 인스턴스 필드의 이름이 같은 경우 this 필요
        // this 를 붙임으로써 자기자신을 참조하는 것으로 변수 이름이 같아도 컴파일러가 구분을 가능하게 해줌
        maxSpeed = speed;
    }
    // 세터 메소드라 부른다.
    void setName(String name) {
        productName = name;
    }
    void setColor(String color) {
        this.color = color;
    }
    void  viewCar() {
        System.out.println("이름 : " + productName);
        System.out.println("색상 : " + color);
        System.out.println("최고속도 : " + maxSpeed);

    }
}
