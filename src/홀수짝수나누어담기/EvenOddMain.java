package 홀수짝수나누어담기;
// 7개의 정수를 입력받아 홀수와 짝수를 각각의 배열에 담기
// 첫번째 메소드는 7개의 정수를 입력받는 메소드
// 두번째 메소드는 홀수와 짝수를 나누어 담는 메소드
// 세번째 메소드는 결과를 출력하는 메소드

import java.util.Scanner;

// inputArray[7]
// oddArray[7]
// evenArray[7]
// 입력 1 2 3 4 5 6 7
// 홀수 1 3 5 7
// 짝수 2 4 6
public class EvenOddMain {
    public static void main(String[] args) {
        EvenOddArray evenOddArray = new EvenOddArray();
        evenOddArray.inputValue();
        evenOddArray.separate();
        evenOddArray.displayValue();


    }
}
