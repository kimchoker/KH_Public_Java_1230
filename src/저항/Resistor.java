package 저항;

import java.util.Arrays;
import java.util.Scanner;

public class Resistor {
    public static void main(String[] args) {
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int[] thd = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        int tenth = 0;
        int units = 0;
        int multiple = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("색을 입력하세요");
        String first = sc.next();
        String second = sc.next();
        String third = sc.next();
        for (int i = 0; i < 10; i++) {
            if (first.equalsIgnoreCase(color[i])) tenth = i;
            if (second.equalsIgnoreCase(color[i])) units = i;
            if (third.equalsIgnoreCase(color[i])) multiple = thd[i];
        }
        System.out.println((long)((tenth * 10) + units) * multiple);
    }
}
