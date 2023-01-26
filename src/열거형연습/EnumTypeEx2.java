package 열거형연습;
// 타입체크를 할 수 있다는 것이 큰 장점

public class EnumTypeEx2 {
    public static void main(String[] args) {
        Developer developer = new Developer("김준혁", DevType.BACKEND, Career.JUNIOR, Gender.MALE);
        developer.devInfo();
        Developer developer1 = new Developer("유경연", DevType.FRONTEND, Career.JUNIOR, Gender.FEMALE);
        developer1.devInfo();
    }
}
