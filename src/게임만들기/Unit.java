package 게임만들기;

abstract public class Unit {
    protected String name;
    protected int pPower;
    protected int mPower;
    protected double pHit; // 물리 적중률
    protected double mHit; // 마법 적중률
    protected int ultraPower; // 궁극기 (해당 캐릭터가 가진 특수 능력)
    protected int hp; // 체력
}
