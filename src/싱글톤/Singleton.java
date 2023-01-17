package 싱글톤;

public class Singleton {
    String name;
    int id;
    private static Singleton singleton = new Singleton();
    private  Singleton() {
        name = "test";
        id = 100;
    }
    // getSingleton() 메소드 호출시 미리 만들어져 있는 싱글톤 객체의 참조변수를 반환하다.
    static public Singleton getSingleton() {
        return singleton;
    }

}
