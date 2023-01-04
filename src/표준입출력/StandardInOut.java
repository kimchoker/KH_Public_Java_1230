package 표준입출력;

public class StandardInOut {
    public static void main(String[] args) {
        String name = "유경연";
        String addr = "관악구";
        char gender = '여';
        int age = 24;
        int kor = 99;
        int eng = 88;
        int math = 96;
        double average = (double)(kor + eng + math)/3;
        // 자바 스타일 (print() / println() - 메소드 오버로딩)
        System.out.println("=========Java Style========");
        System.out.println("이름 : " + name);
        System.out.println("주소 : "+ addr);
        System.out.println("성별 : "+ gender);
        System.out.println("나이 : "+ age);
        System.out.println("총점 : "+ (kor + eng + math));
        System.out.println("평균 : " + String.format("%.3f" , average));

        // C언어 스타일 (서식 지정자와 이스케이프 시퀸스 사용)
        // 서식지정자 : %d %f %.2f %2d %s %c %b %%
        // 이스케이프 시퀀스 \n(줄바꿈), \r(커서를 가장 앞으로 돌림), \t(tab 만큼 띄움), \b(백스페이스)

        System.out.printf("========C Style========\n");
        System.out.printf("이름 : %s\n", name);
        System.out.printf("주소 : %s\n", addr);
        System.out.printf("성별 : %c\n", gender); // %c 문자 출력
        System.out.printf("나이 : %d\n", age); //%d 정수 출력
        System.out.printf("총점 : %d\n", kor + eng + math);
        System.out.printf("평균 : %.2f\n", (double)(kor + eng + math)/3);


        System.out.printf("Apple, Banana\b\b\b"); // \r을 사용하면 \r 앞에있는 문자를 친 후 커서를 다시 제일 앞으로 돌려 입력을 다시 시작함

        System.out.println("\"Enter\"키를 입력하시면 종료됩니다."); // "를 그냥 넣으면 오류가 남 오류가 나지 않게 하기 위해 \ 뒤에 "를 넣음으로써 "를 명령어가 아닌 그냥 쌍따옴표로 입력하게 됨
        System.out.println("Hello\\Java");
        System.out.printf("오늘의 습도는 %d%%입니다.\n", 25);


    }

}