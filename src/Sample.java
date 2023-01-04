/* 
- public : 접근 제한자를 의미한다. (private, public, protected)
- Class 이름은 일반적으로 대문자로 시작한다.
- 객체 이름은 소문자로
- void 는 메소드 수행 이후에 반환값이 없음을 의미한다.
- main 은 프로그램의 시작 위치를 의미하며 JVM 에 의해 호출된다.
- System.out 은 자바의 표준 출력 클래스 (print, println, printf)
- 자료형 이름 첫글자가 대문자라면 참조형
- 참조형은 실제 데이터를 가지고 있는 것이 아니라 정보가 저장된 위치값을 가지고 있음 - 값을 직접 저장하기에는 값이 너무 크기 때문에
- 참조형의 주소는 저장하는 데 8byte를 사용함
- boolean 자료형은 표현하는데 1bit면 충분하지만 하드웨어의 저장 기본 단위가 1byte이기 때문에 표현단위가 1byte다.
- 정수형은 별일 없으면 int형을 쓰면 됨.
- 프로그램의 구조가 int 형을 기본으로 쓰고있기 때문에 byte나 short를 쓰더라도 속도적으로 이점을 갖는것은 없음.
- 음수를 표시해야 하기 때문에 2의 n승을 /2로 나눈 값을 양수와 음수로 나타낼 수 있음
-
*/
public class Sample { // Sample Class
    public static void main(String[] args) {
        System.out.println(1004);
        System.out.println(3.141592);
        System.out.println("응애");
        System.out.println("가" + "라" + "고");
        System.out.printf("%d %d %f\n", 3000, 6000, 1.456);
        System.out.printf("%f\n", 3.141592);

        
        }
    }

