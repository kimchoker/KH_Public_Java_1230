package 쓰레드예제7;

public class InterruptThread extends Thread {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("쓰레드 실행중");
                Thread.sleep(1); // sleep가 추가되어 있음
            }
        } catch (InterruptedException e) {
            System.out.println("인터럽트가 발생하여 스레드를 종료합니다");
        }
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}
