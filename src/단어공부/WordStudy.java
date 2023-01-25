package 단어공부;

import java.util.Scanner;

// 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내기
// 단 가장 많이 사용된 알파벳이 여러개인 경우 ? 출력
// 단 가장 많이 사용된 알파벳의 대문자를 출력
// Misisipi > ?
// zZa > Z
public class WordStudy {
    public static void main(String[] args) {
        int[] alphabet = new int[26]; // 알파벳 숫자만큼의 배열 생성
        Scanner sc = new Scanner(System.in);
        System.out.println("단어를 입력하세요");
        String word = sc.next();
        int max = 0; // ?를 찍어주기 위함
        char rst = 0; // 제일 많이 동작한 문자를 찍기 위해
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) >= 'a') alphabet[word.charAt(i) - 'a']++;
            else alphabet[word.charAt(i) - 'A']++;
        }
        for(int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] == max) rst = '?';
            else if (alphabet[i] > max) {
                max = alphabet[i];
                rst = (char) ('A' + i);
            }
        }
        System.out.println(rst);
    }
}