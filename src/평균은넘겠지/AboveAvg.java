package 평균은넘겠지;
// 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다
// 5 -> 총 테스트 케이스
// 5 50 50 70 80 100 -> 각 테스트 참여한 학생 수와 각각의 점수
// 7 100 95 90 90 60 70 60 50
// 3 70 90 80
// 3 70 90 81

import java.util.Scanner;

// 40.000%
// 57.143%
// 33.333%
// 66.666%
// 55.556%
public class AboveAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("총 테스트 횟수를 입력하세요");
        int testCnt = sc.nextInt();
        double[] cse = new double[testCnt];
        for (int i = 0; i < cse.length; i++) {
            cse[i] = overRate();
        }
        for (double e : cse) {
            System.out.printf("%.3f%%\n", e);
        }
    }

    static double overRate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("참여한 인원수를 입력하세요.");
        int sum = 0;
        double cnt = 0;
        int participant = sc.nextInt();
        int[] score = new int[participant];
        System.out.println("점수를 입력하세요");
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();

        }
        for (int i : score) {
            sum = sum + i;
        }
        int avg = sum / participant;
        for (int i : score) {
            if (i > avg) cnt++;
        }
        double rst = cnt / participant * 100;
        return rst;
    }
}

