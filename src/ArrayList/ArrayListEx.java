package ArrayList;
import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
//        List<String> pitches = new ArrayList<>();
//        pitches.add("156km");
//        pitches.add("121km");
//        pitches.add("137km");
//        pitches.add("145km");
//        pitches.add("133km");
//        pitches.add(0, "150km"); // 특정 위치에 값을 삽입
//        System.out.println(pitches);
//        System.out.println(pitches.get(1)); // 해당 인덱스의 값을 출력
//        System.out.println(pitches.size()); // List 내부에 있는 요소의 갯수를 반환
//        System.out.println(pitches.contains("150km")); // 해당 값이 내부에 있는지 확인(true/false)
//        System.out.println(pitches.remove("149km")); // 해당 값이 내부에 있으면 삭제하고 true 반환, 없으면 false 반환
//        System.out.println(pitches.remove(0)); // 해당 인덱스의 값을 삭제하고 삭제된 값을 리턴
//        System.out.println(pitches);
        String[] data = {"152", "135", "125", "111", "144", "162", "86"};
        List<String> pitches = new ArrayList<>(Arrays.asList(data));
        // 이미 만들어져 있는 배열의 데이터값을 그대로 가져와서 값을 넣음
//        String rst = String.join(",", pitches); // 콤마로 구분하여 문자열 만들기
        pitches.sort(Comparator.reverseOrder()); // 내림차순 정렬
        pitches.sort(Comparator.naturalOrder()); // 오름차순
        System.out.println(pitches);

    }
}
