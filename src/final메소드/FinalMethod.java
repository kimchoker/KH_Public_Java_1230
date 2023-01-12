package final메소드;
// final 키워드 : 최종 상태라는 의미가 있음
// final 키워드를 클래스, 필드, 메소드 선언시에 사용가능

public class FinalMethod {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar("Ferrari");
        sportCar.setTurbo(true);
        sportCar.infoCar();
        sportCar.accelerator();
        sportCar.breakPanel();

        ElectricCar electricCar = new ElectricCar("ev6");
        electricCar.setAutoDrv(true);
        electricCar.infoCar();
        electricCar.accelerator();
        electricCar.breakPanel();
    }
}
