package 일차원배열;
// 배열이란, 같은 타입의 변수들로 이루어진 유한집합
// 배열을 구성하는 값을 배열의 요소(element)라고 하고, 배열에서의 위치를 인덱스라고 함
// 배열의 인덱스는 0부터 시작하며 양수값만을 가질 수 있습니다.
// 배열을 선언하는 방법 - 타입[] 배열이름 = new 타입[배열의 길이]
public class BasicArray {
    public static void main(String[] args) {
        int[] score = {33, 44, 50, 67, 50};
        // 총점과 평균 구하기
        int sum = 0;
//        for(int i = 0; i < score.length; i++) {
//            sum +=score[i];
//        }
        // 향상된 for문 사용하기
        // 배열의 요소를 자동 순회함
        // 파이썬은 기본 for문이 이렇게 동작함
        // 위에 가려놓은거랑 아래랑 같은거임
        for(int m : score)
            sum += m;

        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f\n" , (double)sum/score.length);
    }

}
