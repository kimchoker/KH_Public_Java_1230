package Arrays연습문제;

import java.util.Arrays;
import java.util.Scanner;

// 천 개의 배열을 생성하고 각 배열에 천 미만의 임의의 수 생성(중복값 제거)
// 찾을 임의의 수 입력
// 배열을 오름차순으로 정렬한 후 찾을 수를 이분검색을 이용하여 값 찾기
// 값을 찾으면 해당 값의 위치를 출력
public class ArraysPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("찾고싶은 숫자를 입력하세요 0 ~ 1000");
        int[] arr = new int[1000];
        int cnt = 0;
        while (true) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = ((int) (Math.random() * 1000) + 1);

                for (int j = 0; j < arr.length; j++) {
                    if(arr[j] == j) cnt++;
                    if(cnt >= 2) arr[j] = ((int) (Math.random() * 1000) + 1);

                }
            }
            Arrays.sort(arr);
        }
    }
}