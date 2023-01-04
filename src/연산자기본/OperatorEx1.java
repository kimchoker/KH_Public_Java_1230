package 연산자기본;

import java.util.Scanner;

// 산술 연산자 : +, -, *, /, %(나머지 연산자)
// 대입 연산자 :  =  변수에 값을 대입할 때 사용하는 이항 연산자 입니다. (방향은 오른쪽에서 왼쪽으로 진행)
// 증감 연산자 :  ++, --  단항 연산자, 피연산자의 값을 1 증가시키거나 1 감소시킴
// 비교 연산자 : 두개의 피 연산자를 비교하여 참과 거짓을 판별하는 것
// 논리 연산자
// AND(&&) 두개의 조건이 모두 참이라면 참
// OR(||) 두 개의 조건 중 하나만 참이면 참
// NOT(!) 현재의 조건을 부정
// 삼항연산자 : 항이 3개인 연산자. 조건문의 일종. 참과 거짓만 있는 경우에 사용 가능.
// 문자열 결합 연산자 : +
// 연산자의 우선순위
// 연산자는 동등한 격일 경우 왼쪽에서 오른쪽으로
// 대입연산자일 경우 오른쪽에서 왼쪽으로
public class OperatorEx1 {
    public static void main(String[] args) {
        // 산술 연산자 : +, -, *, /, %(나머지 연산자)
        int num1 = 10, num2 = 0;
        System.out.println("+ 연산자 : " + (num1 + num2));
        System.out.println("- 연산자 : " + (num1 - num2));
        System.out.println("* 연산자 : " + (num1 * num2));
        try {
            System.out.println("/ 연산자 : " + (num1 / num2));  // 몫을 구하는
        } catch (ArithmeticException e)   {
           System.out.println("0으로 나눌 수 없습니다.");
        }
        // System.out.println("/ 연산자 : " + ((double)num1 / num2));     // 나머지가 없는 나눗셈의 결과를 구함
        // System.out.println("% 연산자 : " + (num1 % num2));             //나누고 남은 나머지를 구하는 연산. 생각보다 많이 쓰임

        System.out.println("====================");


        // 대입 연산자 :  =  변수에 값을 대입할 때 사용하는 이항 연산자 입니다. (방향은 오른쪽에서 왼쪽으로 진행)
        int x, y, z = 10;

        x = y = z;
        System.out.println(x + " " + y + " " + z);

        int num3 = 10;
        System.out.println(num3 +=2);   // num3 = num3 + 2 이렇게 풀어 써도 상관은 없긴 함
        System.out.println(num3 -=2);   // num3 = num3 - 2 이렇게 풀어 써도 상관은 없긴 함
        System.out.println(num3 *=2);   // num3 = num3 * 2 이렇게 풀어 써도 상관은 없긴 함
        System.out.println(num3 /=2);   // num3 = num3 / 2 이렇게 풀어 써도 상관은 없긴 함
        System.out.println(num3 %=2);   // num3 = num3 % 2 이렇게 풀어 써도 상관은 없긴 함


        System.out.println("====================");

        // 증감 연산자 :  ++, --  단항 연산자, 피연산자의 값을 1 증가시키거나 1 감소시킴
        int num4 = 10;
        System.out.println(num4++);     // num4값을 사용한 후(출력한 후) 1을 증가시킴
        System.out.println(++num4);     // 1을 증가시킨 뒤 출력함

        // 위치에 따라 처리방식이 다름

        System.out.println("====================");

        int a = 10, b = 20;
        System.out.println(a > b);   //false
        System.out.println(a < b);   //true
        System.out.println(a >= b);   //false
        System.out.println(a <= b);   //true
        System.out.println(!(a <= b));   //false - 논리연산자 !에 의해 안의 값이 참이지만 반대로 출력하여 false가 됨

        System.out.println("====================");

        int c = 10, d = 20;
        boolean rst1, rst2, rst3;
        rst1 = (c > 0) && (c > d); // false, 앞에 나온 조건이 거짓이면 뒷 조건은 보지 않음
        rst2 = (c > 0) || (c > d); // true, 앞에 나온 조건이 참이면 뒷 조건은 보지 않음
        rst3 = !((c > 0) || (c > d)); // false, 앞에 나온 조건이 참이므로 가장 내부의 괄호는 참. 그렇지만 !가 있으므로 거짓

        System.out.println(rst1);
        System.out.println(rst2);
        System.out.println(rst3);

        System.out.println("====================");


        Scanner sc = new Scanner(System.in);     //입력을 받기 위한 스캐너 객체 생성
        System.out.print("나이를 입력하세요 : ");

        int age = sc.nextInt();
        boolean isAdult = (age>19) ? true : false;
        if(isAdult == true) {

            System.out.println("성인 입니다.");

        } else{
            System.out.println("성인이 아닙니다.");
        }
        System.out.println("====================");

        System.out.println("Java" + 11.04 + 12);

        System.out.println("====================");

        int val1 = 5, val2 = 5, val3 = 5;
        int rst5, rst6, rst7;
        rst5 = val1 + val2 * val3; // 30
        rst6 = (val1 + val2) * val3; // 50
        rst7 = val1 + (++val2) * val3; // 35

        System.out.println(rst5);
        System.out.println(rst6);
        System.out.println(rst7);

    }
}
