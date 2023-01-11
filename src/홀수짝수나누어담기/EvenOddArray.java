package 홀수짝수나누어담기;
// 내 코드 실패의 이유 : 0도 짝수인데 0이 들어갔을때 출력값을 얻어낼 수가 없음
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenOddArray {
//    int[] inputArray = new int[7];
//    int[] evenArray = new int[7];
//    int[] oddArray = new int[7];
//    int evenIdx = 0;
//    int oddIdx = 0;
    List<Integer> inList = new ArrayList<>();
    List<Integer> oddList = new ArrayList<>();
    List<Integer> evenList = new ArrayList<>();

    void inputValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int value = 0;
        while (true) {
            value = sc.nextInt();
            if (value == 999) break;
            inList.add(value);

        }
    }
//        for (int i = 0; i < 7; i++) {
//            inputArray[i] = sc.nextInt();
//        }


    void separate() {
           for (int e : inList){
               if(e % 2 == 0) evenList.add(e);
               else oddList.add(e);
//        for (int e : inputArray) {
//            if (e % 2 == 0) evenArray[evenIdx++] = e;
//            else oddArray[oddIdx++] = e;
////        for (int i = 0; i < 7; i++) {
////            if (inputArray[i] % 2 == 0) evenArray[i] = inputArray[i];
////            else oddArray[i] = inputArray[i];
        }
    }

    void displayValue() {
        System.out.print("홀수 : ");
        for(int e : oddList) System.out.print(e + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for(int e : evenList) System.out.print(e + " ");
//        System.out.print("홀수 : ");
//        for (int i = 0; i < oddIdx; i++) {
//            System.out.print(oddArray[i] + " ");
//        }
//        System.out.println();
//        System.out.print("짝수 : ");
//        for (int i = 0; i < evenIdx; i++) {
//            System.out.print(evenArray[i] + " ");

//        System.out.print("짝수는");
//        for (int i = 0; i < evenArray.length; i++) {
//            if(evenArray[i] == 0) {}
//            else System.out.print(evenArray[i] + " ");
//        }
//        System.out.print("홀수는");
//        for (int i = 0; i < oddArray.length; i++) {
//            if(oddArray[i] == 0) {}
//            else System.out.print(oddArray[i] + " ");
//        }

        }
    }


