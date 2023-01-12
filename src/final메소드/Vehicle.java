package final메소드;
// 메소드 앞에 final 을 사용하면 상속받는 클래스에서 오버라이딩을 할수없는 메소드가 됨
public class Vehicle {
    int speed;
    String color;
    String name;
    final void accelerator() {
        System.out.println(name + "의 속도를 증가시킵니다.");
    }
    final void breakPanel() {
        System.out.println(name + "의 속도를 감소시킵니다.");
    }
}

class SportCar extends Vehicle {
    boolean isTurbo;
    SportCar(String name) {
        isTurbo = false;
        speed = 280;
        this.name = name;
        color = "red";
    }
    int getSpeed() {
        if(isTurbo) return speed *= 1.2;
        return speed;
    }
    boolean isTurbo() {
        return  isTurbo;
    }
    void setTurbo(boolean isTurbo) {
        this.isTurbo = isTurbo;
    }
    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + getSpeed());
        System.out.println("색상 : " + color);
        System.out.println("터보모드 : " + isTurbo());
    }
}

class ElectricCar extends Vehicle {
    boolean isAutoDrv; // 자율주행
    ElectricCar(String name) {
        isAutoDrv = false;
        speed = 200;
        this.name = name;
        color = "White";
    }
    boolean isAutoDrv() {
        return isAutoDrv;

    }
    void setAutoDrv(boolean autoDrv) {
        isAutoDrv = autoDrv;
    }
    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println("자동주행 : " + isAutoDrv());
    }
}