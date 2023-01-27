package Map기본;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// HashMap :  키와 값의 쌍(pair)으로 구성되어 있음. 키는 중복 불가 / 값은 중복 가능
// 키의 중복 여부 확인은 HashCode 를 이용해 확인한다.
// hash 알고리즘의 특징은 키값을 해시함수의 입력으로 전달하여 정수값의 결과를 반환함.
public class MapTestEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // 객체 추가
//        map.put("Americano", 2500);
//        map.put("latte", 3500);
//        map.put("plain yogurt Smoothie", 3800);
//        // 객체 찾기
//        System.out.println(map.get("latte")); // 키에 대한 값을 출력
//        // 객체 삭제
//        map.remove("latte"); // 키를 넣어서 객체 삭제
        map.put("김준혁", 100);
        map.put("김영웅", 95);
        map.put("김현준", 90);
        map.put("유경연", 100);
        map.put("김준혁", 99);// 키값이 같기때문에 나중에 들어온 값으로 대체됨
        System.out.println("총 Entry 수 : " + map.size()); // map의 개체 수 확인
        System.out.println(map.get("김준혁"));
        // map 순회 방법(반복자 : iterator 사용법)
        Set<String> keySet = map.keySet();
        //        while (iterator.hasNext()) {
//            String key = iterator.next();
//            Integer val = map.get(key);
//            System.out.println(key + " : " + val); }
        for (String key : keySet) {
            System.out.println(key + " : " + map.get(key));
            // 위랑 같은거임 이게 더 쉬움
        }
        map.remove("김현준");
        System.out.println("총 Entry 수 : " + map.size());
        // replace() 메소드를 사용해 값을 수정
        map.replace("김준혁", 100);
        map.clear(); // 객체 전체 삭제
        System.out.println("총 Entry 수 : " + map.size());
    }
}