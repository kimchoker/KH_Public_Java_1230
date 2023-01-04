package 데이터타입변환;
// 타입변환이란 선언된 변수의 데이터 타입을 다른 타입으로 변경하는 것
// 묵시적 타입 변환(자동 타입 변환) : 컴파일러가 자동으로 변환해주는 것으로 유리한 방향으로 타입 변환이 일어난다.
// 명시적 타입 변환 : 개발자가 의도적으로 형을 변경하는 것.
// 메소드를 사용하는 형 변환 : 문자열을 숫자 타입으로 변경이 필요한 경우
public class ConvType {
    public static void main(String[] args) {
        int num1 = 1, num2 = 4;
        double rst1 = (double) num1 / num2;
        double rst2 = 100 + 100.1;
        String phoneNumber = "01082535501";
        String birthDay = "19970326";
        int number = Integer.parseInt(phoneNumber);
        System.out.println(number);
        // 문자로 적혀있는 내용을 정수로 바꾸는 방법

        String Temp = "3.65";
        double numberTmp = Double.parseDouble(Temp);
        System.out.println(numberTmp + 25);
        // 문자형으로 적힌 숫자를 실수로 변환하는 방법
    }   
}
