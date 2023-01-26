package 제네릭예제1;
// 멀티 타입 파라미터 : 타입 변수를 여러개 사용하는 방법

public class GenericEx1 {
    public static void main(String[] args) {
        Product<String, Integer>  pr1 = new Product<>();
        pr1.setName("경연이의쿠로미");
        pr1.setYear(2023);

        Product<Integer, String> pr2 = new Product<>();
        pr2.setName(2024);
        pr2.setYear("준혁");
    }
}
