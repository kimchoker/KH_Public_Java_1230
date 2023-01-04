package 기본for문;
// for(초기식; 조건식; 증감식) {}
// for문 안에 명령문이 세 줄 들어가있는 형태

public class ForEx1 {
    public static void main(String[] args) {
        int i = 1; // 초기값을 밖에
        for (; ;) {
            System.out.printf("%4d", i);
            if (i % 10 == 0) System.out.println();
            if(i == 100) break; // 조건식
            i++; //증가값
            // for문 안에 초기 조건 증감식을 넣어도 되지만 위의 코드처럼 밖으로 전부 빼내서 적어도 자리만 맞다면 동작함
        }
        System.out.println();
    }

}