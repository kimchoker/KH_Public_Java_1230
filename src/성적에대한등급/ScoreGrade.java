package 성적에대한등급;

import java.util.Scanner;

// 성적을 입력받음
// 입력 받은 성적이 0과 100 사이가 아니면 "성적을 잘못 입력했습니다." 출력
// 90 이상 A 80 이상 B 70이상 c 60이상 D 나머지는 F
public class ScoreGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("성적을 입력하세요.");
        int score = sc.nextInt();

        if(score > 100 || score < 0) {
            System.out.println("성적을 잘못 입력했습니다.");

        } else if (score >= 90) {
            System.out.println("당신의 등급은 A입니다.");
        } else if (score >= 80) {
            System.out.println("당신의 등급은 B입니다.");
        } else if (score >= 70) {
            System.out.println("당신의 등급은 C입니다.");
        } else if (score >= 60) {
            System.out.println("당신의 등급은 D입니다.");
        } else {
            System.out.println("당신의 등급은 F입니다.");
        }
    }
}



