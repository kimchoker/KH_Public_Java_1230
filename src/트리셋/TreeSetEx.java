package 트리셋;
// TreeSet : 이진 검색트리 형태로 자동 정렬되며 값이 저장되는 것이 특징.
// 데이터 추가와 삭제, 검색 등에서 매우 효율적임
// 값은 이진검색트리 형태로 저장되고 검색은 중위순회를 통해 오름차순으로 출력
// 23 10 48 15 7 22 56
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(78);
        ts.add(45);
        ts.add(60);
        ts.add(54);
        ts.add(92);
        ts.add(50);
        ts.add(85);
        System.out.println("60점 미만 : " + ts.headSet(60));
        System.out.println("60점 이상 : " + ts.tailSet(60));
        // 주어진 값 바로 아래의 값 출력
        System.out.println("60점 바로 아래 점수 : " + ts.lower(60));
        // 주어진 값 바로 위의 값 출력
        System.out.println("60점 바로 위 점수 : " + ts.higher(60));

    }
}
