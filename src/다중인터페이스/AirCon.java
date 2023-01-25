package 다중인터페이스;

public interface AirCon {
    int MAX_TEMP = 30; // public final static 이 자동으로 붙어있는 상태 상수는 관례상 대문자로 써주면 구분하기 편함
    int MIN_TEMP = 0;
    void airConON(); // 자동으로 public abstract 가 추가된 추상 메소드
    void airConOFF();
    void setAirConTemp(int temp);
}
