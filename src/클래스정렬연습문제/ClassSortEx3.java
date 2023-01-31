package 클래스정렬연습문제;
// 문제 : 첫 번째 줄에 학생의 수 N을 입력
// 두번째 줄부터 학생의 이름과 성적을 공백 기준으로 입력
// 3
// 카즈하 59
// 사쿠라 68
// 민주 97
// 출력 조건 : 모든 학생의 이름을 성적이 낮은 순서대로 출력하기


import java.util.Scanner;
import java.util.TreeSet;

public class ClassSortEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<grade> ts = new TreeSet<>(new AscendingComp());
        while (true) {
            System.out.println("기준인원을 입력하세요");
            int num = sc.nextInt();
            System.out.println("이름과 점수를 입력하세요");
            for (int i = 0; i < num; i++) {
                ts.add(new grade(sc.next(), sc.nextInt()));
                sc.nextLine();
            }
            System.out.println("성적이 낮은 순으로 출력합니다.");
            for (grade e : ts) {
                System.out.print(e.name + " : ");
                System.out.print(e.score);
                System.out.println(" ");
            }
            System.out.println("다시 입력 하시겠습니까? [1] Y [2] N");
            int ret = sc.nextInt();
            if(ret != 1) break;
        }
    }
}