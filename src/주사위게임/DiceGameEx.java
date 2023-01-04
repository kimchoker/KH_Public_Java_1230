package 주사위게임;
// 두 개의 주사위를 굴려 합이 12가 나오면 종료하는 게임
public class DiceGameEx {
    public static void main(String[] args) {
        while (true) {
            int num1 = (int) ((Math.random() * 6) + 1);
            int num2 = (int) ((Math.random() * 6) + 1);

            if(num1 + num2 == 12) {
                System.out.println("무인도를 탈출합니다.");
                break;
            }
            System.out.println("주사위의 합은" + (num1 + num2) + "입니다.");
        }
    }

}
