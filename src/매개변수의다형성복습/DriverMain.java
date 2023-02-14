package 매개변수의다형성복습;

import java.util.Scanner;

// 상속관계를 이용해 매개변수에 자식타입의 객체를 사용하는 것
public class DriverMain {
    public static void main(String[] args) {
        Driver driver = new Driver("김영웅");
        SportCar sportCar = new SportCar();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        Scanner sc = new Scanner(System.in);
        System.out.println("운전하고 싶은 차를 선택하세요 1. 버스 2. 택시 3. 스포츠카");
        int sel = sc.nextInt();
        switch (sel) {
            case 1 :
                driver.drive(bus); break;
            case 2 :
                driver.drive(taxi); break;
            case 3:
                driver.drive(sportCar); break;
        }
    }
}

class Vehicle {
    public void run() {
        System.out.println("운행중");
    }
}

class Bus extends Vehicle {
    @Override
    public void run() {
        System.out.println(" 버스 운행중");
    }

}

class Taxi extends Vehicle {
    @Override
    public void run() {
        System.out.println(" 택시 운행중");
    }
}

class SportCar extends Vehicle {
    @Override
    public void run() {
        System.out.println(" 스포츠카 운행중");
    }
}

class Driver {
    String name;
    public Driver(String name) {
        this.name = name;
    }
    public void drive(Vehicle vehicle) {
        System.out.print(name + "의");
        vehicle.run();
    }
}