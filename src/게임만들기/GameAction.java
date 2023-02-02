package 게임만들기;

public interface GameAction {
    double pAttack(); // 물리공격에 대한 정의
    double mAttack(); // 마법공격에 대한 정의
    int ultimate(); // 궁극기로 입히는 공격량
    boolean setDamage(double damage); // 피해량을 입력 받아 죽으면 true 반환
}
