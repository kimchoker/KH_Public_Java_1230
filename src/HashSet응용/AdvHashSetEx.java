package HashSet응용;

import java.util.*;

// 문제 : 알파벳 소문자로 이루어진 N개의 단어가 들어오면, 아래의 조건으로 정렬하기
// - 길이가 짧은 것 부터
// - 길이가 같으면 사전순으로
// - 같은 단어가 여러 번 입력되면 한번씩만 출력
// 13이라고 입력하면 연속으로 13개의 단어를 연속적으로 입력받음
// but I want hesitate no more it cannot wait im yours
// i im it no but more wait want yours cannot hesitate
public class AdvHashSetEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt(); // 입력받을 단어의 갯수를 입력받기
        String[] word = new String[cnt];
        for (int i = 0; i < word.length; i++) {
            word[i] = sc.next();

        }
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(word));
        // 배열을 HashSet 에 대입 - 대입 시 자동으로 중복이 제거됨
        word = hashSet.toArray(new String[0]); // 배열의 크기를 0으로 지정하면 자동으로 배열크기가 지정됨
        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2); // 반환값이 양수이면 정렬조건.
                } else {
                    return o1.length() - o2.length(); // 양수가 나오게 되면 정렬조건 / 음수가 나오면 그대로
                }
            }
        });
        System.out.println(Arrays.toString(word));
    }
}