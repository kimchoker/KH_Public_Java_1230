package ArrayList응용;

public class MemberInfo {
    String name;
    String id;
    String pwd;
    String eMail;
    String phone;
    int age;

    public MemberInfo(String name, String id, String pwd, String eMail, String phone, int age) {
        this.name = name;
        this.id = id;
        this.pwd = pwd;
        this.eMail = eMail;
        this.phone = phone;
        this.age = age;
    }
    public void viewInfo() {
        System.out.println("이름 : " + name);
        System.out.println("ID : " + id);
        System.out.println("Password : " + pwd);
        System.out.println("E-mail : " + eMail);
        System.out.println("전화번호 : " + phone);
        System.out.println("나이 : " + age);
    }
}
