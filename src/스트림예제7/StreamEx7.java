package 스트림예제7;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 스트림의 최종 연산 : 중개 연산을 통해 변환된 스트림은 마지막으로 최종 연산을 통해 요소를 소모하여 결과를 표시
// 최종 연산시 모든 요소를 소모한 해당 스트림은 더이상 사용 불가(일회용)
// 요소의 출력 : forEach()
// 요소의 소모 : reduce() 첫번째와 두번째 요소를 가지고 연산을 수행한 뒤, 그 결과와 세번째 요소를 가지고 또 다시 수행
// Optional : NPE(Null Point Exception) 을 방지할 수 있도록 도와주는 클래스
public class StreamEx7 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("넷","둘","셋","하나");
        stream.forEach(System.out::println);

        Stream<String> stream2 = Stream.of("넷","둘","셋","하나");
        Stream<String> stream3 = Stream.of("넷","둘","셋","하나");
        Optional<String> rst = stream2.reduce((s1,s2)->s1 +"++"+ s2);
        rst.ifPresent(System.out::println);


        IntStream intStream = IntStream.of(1,2,3,4,5,6,7,8,9,10);
        OptionalInt sum = intStream.reduce((s1, s2) -> s1 + s2);
        System.out.print(sum.getAsInt());
        System.out.println();

        // 요소의 검색 : findFirst(), findAny()
        IntStream stream4 = IntStream.of(4,2,3,7,3,5,1,6);
        IntStream stream5 = IntStream.of(4,2,3,7,3,5,1,6);
        OptionalInt rst2 = stream4.sorted().findFirst(); // 정렬 이후 첫번째 값을 가져 옴
        System.out.println(rst2.getAsInt());


        OptionalInt rst3 = stream5.sorted().findAny(); //정렬 이후 첫번째 값을 가져 옴 (병렬처리시에는 값이 달라질 수도 있음)
        System.out.println(rst2.getAsInt());

        // 요소의 검사 :
        // anyMatch() : 해당 스트림의 일부 요소가 특정 조건을 만족하는 경우 true
        // allMatch() : 해당 스트림의 모든 요소가 조건을 만족하는 경우 true
        // noneMatch() : 해당 스트림의 모든 요소가 특정 조건을 만족하지 않는 경우 true
        IntStream stream6 = IntStream.of(30,90,70,10);
        IntStream stream7 = IntStream.of(30,90,70,10);
        IntStream stream8 = IntStream.of(30,90,70,10);
        System.out.println(stream6.anyMatch(e->e > 80)); // true
        System.out.println(stream7.allMatch(e->e > 80)); // false
        System.out.println(stream8.noneMatch(e->e > 80)); // false

        // 요소의 통계 :
        // count() : 해당 스트림 요소의 총 개수를 long 타입의 값으로 반환
        // max() : 해당 스트림의 요소 중 제일 큰 값
        // min() : 해당 스트리의 요소 중 가장 작은 값
        IntStream stream9 = IntStream.of(30,90,70,10);
        IntStream stream10 = IntStream.of(30,90,70,10);
        IntStream stream11 = IntStream.of(30,90,70,10);
        System.out.println(stream9.count());
        System.out.println(stream10.max().getAsInt());
        System.out.println(stream11.min().getAsInt());

        // 요소의 연산
        // sum() : 합계
        // average() : 평균값을 구하는 Optional 개체로 반환
        IntStream stream12 = IntStream.of(30,90,70,10);
        DoubleStream stream13 = DoubleStream.of(30.3,90.9,70.7,10.14);
        System.out.println(stream12.sum());
        System.out.println(stream13.average());
    }
}
