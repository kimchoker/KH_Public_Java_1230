package 제네릭예제2;

public class Plastic extends Material {
    @Override
    public void doPrinting() {
    System.out.println("Plastic 재료로 출력합니다.");
}
    public String toString() {
        return "재료는 플라스틱 입니다.";
    }
}

