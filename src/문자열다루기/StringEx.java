package 문자열다루기;
// String 다루기
// 배열과 달리 대체할 수 있는 문법이 없기 때문에 중요함
// 실무에서 자주 사용되는 문법
public class StringEx {
    public static void main(String[] args) {
        // equals() : 2개의 문자열의 동일 여부를 비교하여 결과를 반환

//        String a = "hello";
//        String b = "java";
//        String c = "hello";
//        System.out.println(a.equals(b)); // a 문자열과 b 문자열의 동일 여부를 비교
//        System.out.println(a.equals(c)); // a 문자열과 c 문자열의 동일 여부를 비교
//        System.out.println(a.equalsIgnoreCase("HELLO")); // true : 대소문자 구분을 하지 않음
//        System.out.println(a == c); // 이렇게 비교하면 안됨 : 실제 내용을 비교하는게 아니라 참조하는 주소를 비교하는 것이기 때문

        // indexOf():  문자열에서 틀적 문자가 시작되는 인덱스를 반환하는 메소드
        String d = "Hello Java";
        System.out.println(d.indexOf("Java"));


        // contains() : 문자열에서 특정 문자열 포함여부를 리턴하는 메소드
        System.out.println(d.contains("Java"));


        // charAt() : 문자열에서 인덱스에 해당하는 문자를 반환하는 메소드
        String str = "Hello Java";
        System.out.println(str.charAt(6));

        String str1 = "Apple, Banana, Pineapple, Kiwi, Melon";
        // replace(), replaceAll() : 문자열에서 특정 문자열을 다른 문자열로 대체하고자 할때 사용하는 메소드
        System.out.println(str1.replaceAll("Pineapple", "Orange"));

        // substring(시작인덱스) : 문자열에서 특정 문자를 추출할 때 사용 (시작 인덱스부터 끝까지)
        // substring(시작인덱스, 종료인덱스) :
        System.out.println(str1.substring(7));
        System.out.println(str1.substring(7, 12)); // 시작인덱스부터 종료인덱스 미만까지 출력 그래서 banan 까지만 출력됨

        // toUpperCase() / toLowerCase() : 문자열을 전부 대문자 혹은 소문자로 변경하는 메소드
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        // trim() :  문자열의 앞 뒤의 공백을 제거
        String str2 = "         자바 기반 공공데이터 과정          입니다  !!!!!.";
        System.out.println(str2.trim());

        // split() : 문자열을 특정 구분자 기준으로 분리하는 메소드
        String str3 = "ㅂ ㄱ ㅅ ㄷ ㅈ";
        String[] result = str3.split(" "); // 입력받은 값을 공백 기준으로 나누어 담음
        for(String e : result) System.out.print(e + " ");
        System.out.println();

        // 문자열 포맷팅 : String.format() / System.out.printf()
        // 문자열 내에서 서식을 이용해 값을 삽입하는 방법
        System.out.printf("오늘의 %s는 %d 입니다.\n", "온도", 10);
        String str4 = String.format("오늘의 %s는 %d 입니다", "온도", 10);
        System.out.println(str4);

        // toCharArray() : 문자열을 문자 배열 반환
        char[] word = str3.toCharArray();

        for(int i = 0; i < word.length; i++) {
            System.out.print(word[i] + ",");
        }
    }
}
