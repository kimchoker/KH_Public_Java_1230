package while문기본;
// 정해진 횟수 반복하기
public class WhileEx1 {
    public static void main(String[] args) {
        int treehit = 0;
        while(true) { // 무한의 반복 조건
            treehit++; // 변수값을 1 증가시킴
            System.out.println("나무를 " + treehit + "번 찍었습니다.");
            if (treehit == 10) {
                System.out.println("나무가 넘어갑니다.");
                break; // 반복문을 탈출함
            }
        }
    }
}
