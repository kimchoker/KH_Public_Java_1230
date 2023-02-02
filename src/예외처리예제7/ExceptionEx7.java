package 예외처리예제7;

import java.util.Scanner;

// 사용자 정의 예외 클래스 만들기
public class ExceptionEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckEven checkEven = new CheckEven();
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        try {
            System.out.println(checkEven.printEven(num));
        } catch (EvenException e) {
            e.printStackTrace();
        }



    }
}

class EvenException extends Exception {
    private Integer number = null; // 얘는 됨 객체 타입이기 때문에. 참조하고 있는것이 없다는 의미로 사용 가능.
//    private int num = null; // 얘는 안됨 기본타입이라
//    private Integer num2 = 0; // 얘는 됨 값이 들어왔을 때 내부적으로 박싱 언박싱을 통해 인티저를 자동으로 int로 바꿔주기 때문
    public EvenException(int number) {
        this.number = number;
    }
    @Override
    public String getMessage() {
        if(number == null) {
            return "숫자가 아닙니다";
        } else  {
            return Integer.toString(number) + "는 짝수가 아닙니다.";
        }
    }
}

class CheckEven {
    private int num;
    void setNum(int num) {
        this.num = num;
    }
    int printEven(int number) throws EvenException {
        this.num = number;
        if(num % 2 != 0) {
            throw new EvenException(num);
        } else {
            return num;
        }
    }
}