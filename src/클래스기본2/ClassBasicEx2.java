package 클래스기본2;

public class ClassBasicEx2 {
    public static void main(String[] args) {
        Car gv80 = new Car("제네시스 G80", "White", 230);
        Car santafe = new Car();
        gv80.viewCar();
        santafe.setName("싼타페");
        santafe.viewCar();
    }
}
