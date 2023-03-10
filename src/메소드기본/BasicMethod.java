package 메소드기본;
// 메소드란 하나의 기능을 수행하는 모듈 (함수와 동일하며 객체 내에서 클래스내에 포함됨)
// 접근제한자 반환타입 메소드이름(매개변수목록) {구현부; return}
// 접근제한자 : 해당 메소드가 접근할 수 있는 범위를 명시한다.
// 반환타입 : 메소드가 호출되어 작업을 수행하고 결과를 반환하는 데이터 타입을 명시함
// 매개변수목록 : 메소드 호출시에 전달되는 인수의 값을 저장하는 변수를 명시
// 메소드 이름은 변수 생성규칙과 동일하다(영어 대소문자, $와 _, 숫자가 올 수 있음, 숫자는 가장 앞에는 올 수 없다)
public class BasicMethod {
    public static void main(String[] args) {
        SampleMethod sampleMethod = new SampleMethod();
        // System.out.println(sampleMethod.sum(100, 200)); 요거랑 아래거랑 같음 아래는 풀어쓴거
        int rst = sampleMethod.sum(100, 200);
        System.out.println(rst);
        System.out.println(sampleMethod.strSay());

    }
}



