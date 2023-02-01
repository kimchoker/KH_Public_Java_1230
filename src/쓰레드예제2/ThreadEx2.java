package 쓰레드예제2;

import static java.lang.Thread.sleep;

// 쓰레드 생성 방법 :
// 1. Thread 클래스를 상속받는 방법 (구현이 쉬움, 스레드를 상속 받았기 때문에 다른 클래스 상속이 불가능)
// 2. Runnable 인터페이스를 구현하는 방법 (확장성이 좋음, 다른 클래스로부터 상속을 받을 수 있음)
// 3. Runnable 인터페이스를 이용한 익명의 객체로 구현
// 4. Runnable 인터페이스를 이용한 람다식으로 구현
// 우선순위를 설정해줘도 스레드는 JVM에서 관장하는 것이 아니라 운영체제에서 관장하는 것이기 때문에 확률적으로 높아지는 것이지 아닐수도 있다.
public class ThreadEx2 {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = new Sample(); // 이렇게 객체로만 생성하면 쓰레드 기능이 존재하지 않음
        Thread thread1 = new Thread(task); // 쓰레드를 생성하고 객체를 넣어줘야 실제 쓰레드가 생성 됨
        Thread thread2 = new Thread(task);
        thread1.setPriority(10); // 1 ~ 10 사이의 값으로 우선순위를 줄 수 있다. 10이 가장 높음
        thread1.start(); // start() 메소드를 호출하면 자신의 run() 메소드를 실행
        thread2.start();

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += i;
                    System.out.println("" + Thread.currentThread() + sum);
                }
                System.out.println(Thread.currentThread() + "합계" + sum);
            }
        };
        Thread thread3 = new Thread(task2);
        thread3.start();
        for (int i = 0; i < 100; i++) {
            sleep(1);
            System.out.println("메인");
        }

        Runnable task3 = () -> {
            int sum = 0;
            for (int i = 0; i < 100; i++) {
                try {
                    sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                sum += i;
                System.out.println("" + Thread.currentThread() + sum);
            }
            System.out.println(Thread.currentThread() + "합계" + sum);
        };
        Thread thread4 = new Thread(task3);
        thread3.start();
    }
}
class Basic {

}
class Sample extends Basic implements Runnable {

    @Override
    public void run() {

        int sum = 0;
        for(int i = 0; i < 100; i++) {
            try {
                sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sum += i;
            System.out.println("" + Thread.currentThread() + sum);
        }
        System.out.println(Thread.currentThread() + "합계" + sum);
    }
}