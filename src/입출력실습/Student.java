package 입출력실습;

public class Student implements Comparable<Student> {
    String name;
    int kor;
    int eng;
    int math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    public int getTotal() {
        return math + kor + eng;
    }

    @Override
    public int compareTo(Student o) {
        if (this.getTotal() < o.getTotal()) return 1;
        else if (this.getTotal() == getTotal()) return this.name.compareTo(o.name);
        return -1;
    }
}