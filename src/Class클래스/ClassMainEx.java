package Class클래스;

import Person상속.Per;

public class ClassMainEx {
    public static void main(String[] args) throws ClassNotFoundException {
//        String s = new String();
////        Class c = s.getClass(); // Class의 정보를 읽어 클래스 타입으로 반환
////        Class c = String.class;
//        Class c = Class.forName("java.lang.String");
//        // 위에 세개 다 같은거임
//        System.out.print(c);
        Person person = new Person();
        Class pCls1 = person.getClass(); // Object의 getClass() 메소드 사용
        System.out.println(pCls1.getName());

        Class pCls2 = Person.class; // 직접 class 대입하기
        System.out.println(pCls2.getName());
    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {}
    public Person(String name) {
        this.name = name;
    }
}