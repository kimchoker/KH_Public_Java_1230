package 손익분기점;

import java.util.Scanner;

public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("고정비용을 입력하세요");
        double fixedCost = sc.nextInt();
        System.out.println("생산비용을 입력하세요");
        double varCost = sc.nextInt();
        System.out.println("판매가격을 입력하세요");
        double price = sc.nextInt();
        if(varCost >= price) {
            System.out.println("-1");
            return;
        }
        int total = 0;
        int sellcnt = 0;
        while (true) {
//  1번 방법  if (total <= fixedCost + varCost * sellcnt) {
//                total += price;
//                sellcnt++;
//            } else break;
//            System.out.println("손익분기점은 " + sellcnt + "대 이상 판매");
//            System.out.println("총 판매금액은 " + total);
//  2번 방법   if(sellcnt > fixedCost / (price - varCost)) break;
//            sellcnt++;
//            System.out.println(sellcnt);
//  3번 방법
            System.out.println((fixedCost / (price -varCost) + 1));

        }
    }
}
