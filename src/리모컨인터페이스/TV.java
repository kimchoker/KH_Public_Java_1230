package 리모컨인터페이스;

public class TV implements RemoteControl{
    int volume;
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnoff() {
        System.out.println("TV를 종료합니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME) {
        this.volume = RemoteControl.MAX_VOLUME;
    } else if (volume < MIN_VOLUME) {
        this.volume = RemoteControl.MIN_VOLUME;
    } else {
        this.volume = volume;
    }
        System.out.println("현재 TV의 볼륨 : " + this.volume);
    }
    public void getInfo() {
        System.out.println("TV 입니다.");
        System.out.println("현재 볼륨은 " + volume + "입니다.");
    }
}
