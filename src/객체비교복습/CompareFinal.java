package 객체비교복습;
// 10명의 성적을 입력받음
// 이름 국어 영어 수학
// 총점이 높은 순으로 정렬 총점이 같으면 이름 순 정렬

import java.util.Iterator;
import java.util.TreeSet;

public class CompareFinal {
    public static void main(String[] args) {
        TreeSet<StudentInfo> info = new TreeSet<>();
        info.add(new StudentInfo("아무나", 55, 66, 77));
        info.add(new StudentInfo("무나", 45, 98, 44));
        info.add(new StudentInfo("아무", 88, 99, 12));
        info.add(new StudentInfo("아나", 42, 10, 100));
        info.add(new StudentInfo("아나무", 78, 96, 41));
        info.add(new StudentInfo("무아나", 66, 26, 87));
        info.add(new StudentInfo("나무", 34, 11, 52));
        info.add(new StudentInfo("나아", 77, 63, 42));
        info.add(new StudentInfo("나무아", 59, 66, 72));
        info.add(new StudentInfo("무나아", 65, 61, 67));

//        for(StudentInfo e : info) {
//            System.out.println(e.getTotal() + " : " + e.getName());
//        }

        Iterator<StudentInfo> iterator = info.iterator();
        while (iterator.hasNext()) {
            StudentInfo next = iterator.next();
            System.out.println(next.getTotal() + " : " + next.getName());
        }
    }
}

class StudentInfo implements Comparable<StudentInfo> {
        private String name;
        private int kor;
        private int eng;
        private int math;

    public StudentInfo(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    public int getTotal() {
        return kor + math + eng;
    }
    public String getName() {
        return name;
    }

    @Override
    public int compareTo(StudentInfo o) {
        if(this.getTotal() == o.getTotal()) return this.name.compareTo(o.name);
        return o.getTotal() - this.getTotal();
    }
}