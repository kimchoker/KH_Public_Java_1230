package 이터레이터;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Iterator<E> 인터페이스 : 컬렉션 프레임워크를 저장된 요소를 읽어오는 방법을 Iterator 로 표준화 하고 있음
//public interface Collection<E> extends Iterable<E>{}
//public interface List<E> extends java.util.Collection<E> {}
//public interface Set<E> extends Collection<E> {}
// boolean hasNext() : 다음의 요소가 있는 확인, 있다면 true
// E next() : 요소를 반환
// remove() : next()로 읽어온 요소를 삭제
public class IteratorEx {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if(iterator.next() == 3) iterator.remove();
            // 일반적인 방법은 아니지만 순회중 값을 지워야하는 경우 이터레이터를 이용하는 방법이 유일.
            // 권장되는 방법은 아니므로 값을 지우는 것은 리스트를 추가 수정하는 부분에서 수행하는 것이 적합
        }
        for (int e : list)  System.out.println(e + " ");
    }
}
