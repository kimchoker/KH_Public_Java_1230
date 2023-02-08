package 스트림으로홀수짝수정렬;
// 7개의 정수를 입력받아 홀수와 짝수를 나누어 출력하기
// 스트림을 이용하여 하기
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

// 7개의 정수를 입력받아 홀수 짝수 나누어 출력하기
public class StreamTextEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("7개의 숫자를 입력하세요");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            list.add(sc.nextInt());
        }
        list.stream().filter(e->e % 2 !=0).forEach(e->System.out.print(e + " "));
        System.out.println();
        list.stream().filter(e->e % 2 ==0).forEach(e->System.out.print(e + " "));
    }
}
