package 소수단어;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IsPrimeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        String word = sc.next();
        char[] wordArr = word.toCharArray();
        List<Integer> wordtonum = new ArrayList<>();
        int sum = 0;
        int cnt = 0;
        for (char c : wordArr) {
            wordtonum.add((int) c);
        }
        for (int i = 0; i < wordtonum.size(); i++) {
            if (wordtonum.get(i) >= 65 && wordtonum.get(i) <= 90) {
                wordtonum.set(i, wordtonum.get(i) - 38);
            } else if (wordtonum.get(i) >= 97 && wordtonum.get(i) <= 122) {
                wordtonum.set(i, wordtonum.get(i) - 96);
            }
        }
        for (Integer integer : wordtonum) {
            sum = sum + integer;
        }

        for (int i = 1; i < sum; i++) {
            int rst = sum % i;
            if (rst == 0) cnt++;
        }
        if (cnt == 2) System.out.println("It is a prime word.");
        else System.out.println("It is not a prime word.");
    }
}