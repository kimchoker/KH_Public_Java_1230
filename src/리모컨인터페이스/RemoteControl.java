package 리모컨인터페이스;
// 인터페이스의 특징
// 모든 필드는 자동으로 상수(final static) 으로 변환됨
// 모든 메소드는 자동으로 추상(abstract) 메소드로 변경됨
// 디폴트 메소드는 구현부를 가지고 있으며 상속받은 클래스에서 재정의가 가능
// 정적 메소드는 객체와 상관없이 인터페이스 타입으로 사용 가능
public interface RemoteControl {
    int MAX_VOLUME = 100; // 상수로 정의하지는 않았지만 상수임(인터페이스니까) 객체로 만들어지지 않음
    int MIN_VOLUME = 0; // 얘도 파이널 스태틱 알아서 추가됨

    void turnOn(); // 자동으로 public abstract 가 앞에 붙음 추상 메소드가 됨

    void turnoff();

    void setVolume(int volume);
    void getInfo();
    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }
    default void setMute(boolean mute) {
        if(mute) System.out.println("무음처리를 시작합니다.");
        else System.out.println("무음처리를 해제합니다.");
    }
}


