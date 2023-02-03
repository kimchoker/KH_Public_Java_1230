package 시험;

import java.util.Optional;

public class money {
    public static final String UNIT = "원";
    private int money;

    public money(int money){
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
