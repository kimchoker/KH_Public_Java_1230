package 트리맵기본;
// TreeMap은 TreeSet과 마찬가지로 이진검색 트리로 구현되어 있음.
// TreeSet과의 차이는 키와 값으로 구성된 Map.Entry를 저장
// 부모의 키 값 기준으로 작은것은 왼쪽, 큰 값은 오른쪽으로 자동 저장된다.


import java.util.Map;
import java.util.TreeMap;

public class TreeMapBasic {
    public static void main(String[] args) {
        TreeMap<Integer, String> score = new TreeMap<>();
        score.put(96, "김준혁");
        score.put(95, "유경연");
        score.put(82, "마태식");
        score.put(42, "이문세");
        score.put(61, "박수경");
        Map.Entry<Integer, String> entry = null;
        entry = score.firstEntry(); // Map.Entry 제일 낮은 값을 리턴
        System.out.println("가장 낮은 점수 : " + entry.getKey() + " : " + entry.getValue());
        entry = score.lastEntry(); // Map.Entry 제일 높은 값을 리턴
        System.out.println("가장 높은 점수 : " + entry.getKey() + " : " + entry.getValue());
        entry = score.lowerEntry(96); // 주어진 값 바로 아래의 값을 리턴
        System.out.println("가장 높은 점수 : " + entry.getKey() + " : " + entry.getValue());
        entry = score.higherEntry(85); // 주어진 값 바로 위의 값을 리턴
        System.out.println("가장 높은 점수 : " + entry.getKey() + " : " + entry.getValue());

    }
}
