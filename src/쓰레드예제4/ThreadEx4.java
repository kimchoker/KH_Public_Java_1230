package 쓰레드예제4;
// yield() : 다른 스레드에 실행을 양보하는 메소드. 하지만 양보에 대한 권한은 운영체제가 관리하기 때문에 생각보다 잘 안됨
public class ThreadEx4 {
    public static void main(String[] args) throws InterruptedException {
        ThreadA A = new ThreadA();
        ThreadB B = new ThreadB();
        A.start();
        B.start();
        try {
            Thread.sleep(1000); // 1초 대기
        } catch (InterruptedException e) {
        }
        A.work = false; // Thread A가 자신의 차례일때 실행을 양보

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        A.work = true; // 양보가 없기 때문에 Thread A, B가 경쟁하면서 실행됨

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        A.stop = true;
        B.stop = true;
    }
}


class ThreadA extends Thread {
    boolean stop = false;
    boolean work = true;
    @Override
    public void run() {
        while (!stop) {
            if(work) System.out.println("Thread A가 작업중 입니다.");
            else Thread.yield(); // 작업중이 아니면 현재 쓰레드 실행을 양보
        }
    }
}

class ThreadB extends Thread {
    boolean stop = false;
    boolean work = true;
    @Override
    public void run() {
        while (!stop) {
            if(work) System.out.println("Thread B가 작업중 입니다.");
            else Thread.yield(); // 작업중이 아니면 현재 쓰레드 실행을 양보
        }
    }
}