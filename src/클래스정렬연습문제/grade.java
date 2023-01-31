package 클래스정렬연습문제;

import 클래스정렬2.Fruit;

import java.util.Comparator;

public class grade {
    String name;
    int score;

    public grade(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class AscendingComp implements Comparator<grade> {
    @Override
    public int compare(grade o1, grade o2) {
        if(o1.score == o2.score) {
            return o1.name.compareTo(o2.name); // 성적이 같은 경우 사전순으로 정렬
        } else if(o1.score > o2.score) return 1;
       return -1;
    }
}