package 다중인터페이스;
// 상속과 다중 인터페이스 함께 사용하기
public class MultiInterfaceMain {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar(false, 18, true, 260, "black", "2023", true);
        sportsCar.viewInfo();
    }
}
