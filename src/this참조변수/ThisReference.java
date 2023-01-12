package this참조변수;
// this : this 참조변수는 자기 자신의 객제를 참조하는 변수, 숨겨진 참조변수(기본적으로 숨겨져있음. 꺼내서 사용 가능)
// this() : this 메소드 클래스 내부에서는 여러개의 생성자를 만들 수 있음 (생성자 오버로딩)
// 생성자 오버로딩시에 중복된 코드가 많이 발생하고 이를 개선하기 위해 this() 메소드를 사용
// this() 메소드는 생성자 내부에서만 사용 가능하며 생성자 내부에서 다른 생성자를 호출하는 기능
public class ThisReference {
    public static void main(String[] args) {
        Car santafe = new Car("santafe", 2020,"White", 210);
        santafe.viewCar();
        Car kona = new Car();
        kona.viewCar();

    }
}


class Car {
    private String  modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    public Car (String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;

    }
    public Car() {
        this("G80",2022,"white",200);
    }
    public Car(String name) {
        this(name, 2022,"white",200);
    }
    void  viewCar() {
        System.out.println("이름 : " + modelName);
        System.out.println("연식 : " + modelYear);
        System.out.println("색상 : " + color);
        System.out.println("최고속력 : " + maxSpeed);
    }
}