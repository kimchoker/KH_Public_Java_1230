package 은행만들기;

public class BankClass {
    private static int cnt = 0; // 같은 클래스 내에서만 접근 가능한 정적 변수(클래스 변수)
    private int account;
    private String bank;
    public  BankClass(String name, int account) {
        cnt++; // 클래스가 객체로 만들어 질 때 값이 증가됨.
        this.bank = name;
        this.account = account;
        System.out.println(name + "은행에 계좌를 개설합니다. 잔액은 " + account + "입니다.");
    }
    public static int getCnt() {
        return cnt;
    }
    public void setDeposit(final int dep) {
        this.account += dep;
        System.out.println(dep + "원을 예금했습니다.");
    }
    public void setWithdraw(final int with) {
        if(with > account) {
            System.out.print("잔액이 부족합니다.");
        } else {
            account -= with;
        }
    }
    public void viewAccount() {
        System.out.println("현재 잔액은 " +  account + "원 입니다.");
    }
}
