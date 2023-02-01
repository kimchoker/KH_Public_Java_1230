package 쓰레드예제5;
// join() : 다른 쓰레드가 작동을 완료(다른 쓰레드의 종료)할 때 까지 대기했다가 실행하게 해주는 명령어
// join(시간) : 시간은 일반적으로 밀리세컨드 단위로 줄 수 있으며, 시간 경과하면 기다림을 멈춤
public class ThreadEx5 {
    public static void main(String[] args) {
        SumThread sumTh = new SumThread();
        sumTh.start();
        try {
            sumTh.join(2);
        } catch (InterruptedException e) {
        }
        System.out.println("합 : " + sumTh.getSum());
    }
}


class SumThread extends Thread {
    private long sum;
    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
    @Override
    public void run() {
//        for (int i = 0; i <= 100; i++)
        while (true){
            sum++;
        }
    }


}