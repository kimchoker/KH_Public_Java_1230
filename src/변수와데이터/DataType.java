package 변수와데이터;
// 클래스 이름은 파일 이름과 같아야 한다.
public class DataType {
    // 접근 제한자 (public) + 정적변수(static) + 반환 타입(void) + main()
    public static void main(String[] args) {
        byte num1 = 127; //byte는 정수형 타입이며 표현 범위는 -128~127
        byte num2 = -128;

        num1++; // ++는 증가 연산자. 변수값에 1을 더해준다.
        num2--; // --는 감소 연산자. 변수값에서 1을 빼준다.

        System.out.println(num1);
        System.out.println(num2);

        // 출력해보면 -128과 127이 나온다.
        // 이렇게 나오는 이유는 8비트의 맨 앞의 비트가 부호비트이기 때문이다.
        // 127에 1을 더하면 부호비트가 바뀌어 overflow 현상이 나타나는 것이다.
        // -128의 경우도 마찬가지.


        // 실수는 소수점 이하의 값이 존재하고 기본은 double형이 기본.
        // 실수는 정확한 값이 아닌 근삿값 계산이기 때문에 꼭 필요한 경우가 아니라면 사용하지 않는 것을 추천
        // case 문에서는 실수값을 사용할 수 없다.
        double num3 = 0.1;
        for (int i = 0; i < 1000; i++) {
            num3 += 0.1; //+= 복합대입연산자(값을 더한 후에 자신에게 대입)
        }
        System.out.println(num3);

        // 실행해보면 100.09999999999859 이 나오고 101이 절대 나오지 않는 모습.


        int age = 20; // 정수값을 저장하기 위해 변수 age를 선언, 선언과 동시에 초기화.
        // 이것을 선언함으로써 age에 4byte가 할당됨.

        double value; // 실수값을 저장하기 위해 변수 value를 선언.
        value = 3.14; // 변수 선언 이후에 초기화
        
        System.out.println(age);
        
        int number1234;
       // int 154num; // 숫자로 시작 불가
        int ______1564; // 특수문자는 _, $ 가능
        int $$$$$$$23243; //ㄱㄴ
       // int switch; // 이미 지정된 기능이 있기 때문에 안됨
        int taxRate; // 세율에 대한 변수 선언. 
        // 두 단어 이상이 합쳐진 단어일 경우 제일 앞 글자는 소문자 그 다음 단어의 첫글자는 대문자(카멜 표기법)
        int tax_rate_value; // 얘도 가능

        int num4 = 9, num5 = 26; // 같은 타입의 변수는 (,) 콤마를 이용하여 동시에 선언이 가능하다.
        double num6 = 9.26; //선언과 동시에 초기회

        int hour = 9;
        int minute = 26;

        System.out.println(hour + "시" + minute + "분");

        String name = "ㅇㄱㅇㄱㅇㅇ";
        System.out.println(name);

        NameCard nameCard =  new NameCard();
        nameCard.name = "김준혁";
        nameCard.age = 27;
        nameCard.addr = "경기도 화성시 동탄중앙로";

        System.out.println(nameCard.name);
    }

}

// 사용자 정의 자료형

class NameCard {
    String name;
    int age;
    String addr;
    String eMail;
    String phoneNumber;

}





