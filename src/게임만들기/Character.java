package 게임만들기;

public class Character extends Unit implements GameAction {
    // name 이름 / pP 물리공격력 / mP 마법공격력 / pH 물리명중률 / mH 마법명중률 / ultra 궁극기 공격력 / hp 체력
    public Character(String name, int pP, int mP, double pH, double mH, int ultra, int hp) {
        this.name = name;
        this.pPower = pP;
        this.mPower = mP;
        this.pHit = pH;
        this.mHit = mH;
        this.ultraPower = ultra;
        this.hp = hp;
    }

    @Override
    public double pAttack() { // 물리공격력에 대한 기능 구현
        return pPower * pHit;
    }

    @Override
    public double mAttack() { // 마법공격력에 대한 기능 구현
        return mPower * mHit;
    }

    @Override
    public int ultimate() { // 궁극기
        return ultraPower;
    }

    @Override
    public boolean setDamage(double damage) {
        if(hp > damage) {
            hp -= damage;
            System.out.println(name + "의 남은 HP는 " + hp);
            return false; // hp가 남아있으므로 캐릭터는 살아있음
        } else {
            System.out.println(name + "은 죽었습니다. 게임을 종료합니다.");
            return true;
        }
    }
}
