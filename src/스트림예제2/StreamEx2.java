package 스트림예제2;

import java.util.ArrayList;
import java.util.List;

public class StreamEx2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("준혁", 99));
        list.add(new Student("경연", 95));
        list.add(new Student("영웅", 90));
        list.parallelStream().forEach(s-> {
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name +" : "+ score);
        });

    }
}
class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


}