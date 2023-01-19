package 추상클래스응용;

public abstract class Phone {
    String name;
    boolean isPower;
    Phone(String name) {
        this.name = name;

    }
    void setPower(boolean power) {
        isPower = power;
        if(isPower) {
            System.out.println("Phone Power ON");
        } else {
            System.out.println("Phone Power OFF");
        }
    }
    abstract void call(); // 상속받은 클래스에서 반드시 오버라이딩해서 기능을 완성해야
}
