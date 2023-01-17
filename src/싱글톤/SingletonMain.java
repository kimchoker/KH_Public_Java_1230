package 싱글톤;
// 싱글톤이란 : 프로그램 전체에서 단 하나의 객체만 만들도록 보장하는 것
// 스프링 프레임워크의 서블릿 객체 생성시에 사용된다.
public class SingletonMain {
    public static void main(String[] args) {
        //  Singleton singleton = new Singleton(); 객체 생성 불가(private이므로)
        Singleton singleton1 = Singleton.getSingleton(); // 이미 만들어진 싱글톤 객체의 주소를 받아옴
        Singleton singleton2 = Singleton.getSingleton();
        if (singleton1 == singleton2) { // 참조가 같음을 의미
            System.out.println("같은 싱글톤 객체입니다.");
        } else {
            System.out.println("다른 싱글톤 객체입니다");
        }
        singleton1.id = 999;
        singleton1.name = "무직";
        System.out.println(singleton1.id);
        System.out.println(singleton1.name);
        System.out.println(singleton2.id);
        System.out.println(singleton2.name);
    }
}