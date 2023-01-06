package 평균구하기;
// 5명의 학생이 시험을 치는데 시험점수가 40점 미만이면 보충수업을 듣는 조건으로 점수를 40점으로 수정해줌
// 모든 학생이 40점 미만인 경우 보충 수업을 듣기로 함
// 모든 학생의 성적에 대한 평균을 구하기

import java.util.Scanner;

public class ArrayAvg {
    public static void main(String[] args) {
        int[] grade = new int[5];   // 5명의 성적을 입력받기 위한 배열
        int total = 0;  // 학생 성적을 누적하여 총점을 구하기 위한 변수 생성
        Scanner sc = new Scanner(System.in); // 점수를 입력받기 위한 스캐너 생성
        System.out.println("점수를 입력하세요");




            for (int i = 0; i < grade.length; i++) {
                grade[i] = sc.nextInt(); // 배열에 성적을 입력받기
                if(grade[i] < 40) grade[i] = 40;
                total += grade[i];

            }

            System.out.printf("%.2f\n", (double)total/5);



    }
}
