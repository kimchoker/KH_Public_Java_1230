package 제네릭복습;

public class GenericFinal {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>();
        powderGenericPrinter.setMaterial(new Powder());
        System.out.println(powderGenericPrinter);
    }
}

class Powder {
    public void doPrinting() {
        System.out.println("powder");
    }
    public String toString() {
        return "재료는 파우더";
    }

}

class Plastic {
    public void doPrinting() {
        System.out.println("plastic");
    }
    public String toString() {
        return "재료는 플라스틱";
    }

}
// T 는 타입 변수를 의미하며, 대입되는 타입으로 내부의 형이 결정이 됨(단, 참조타입만 쓸 수 있음)
class GenericPrinter<T> {
    private T material;
    public void setMaterial(T material) {
        this.material = material;
    }
    public String toString() {
        return material.toString();
    }
}