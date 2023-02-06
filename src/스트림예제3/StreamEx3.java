package 스트림예제3;

import java.util.ArrayList;
import java.util.List;

// 스트림으로 중간 처리와 최종 연산 수행
public class StreamEx3 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("준혁", 100));
        list.add(new Student("경연", 90));
        list.add(new Student("영웅", 59));
        list.add(new Student("연준", 44));

        double avg = list.stream()
                .mapToInt(Student::getScore) // 메소드 참조 문법이며, 중간 처리 연산
                // 최종 연산
                .average()
                .getAsDouble();
        System.out.println(avg);
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
