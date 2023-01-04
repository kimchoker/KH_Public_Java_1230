package 진수표현;
// 진법 표현 : 2, 8, 10, 16진법
// 16진법 (0~9, A, B, C, D, E, F)


public class DecType {
    public static void main(String[] args) {

        int var1 = 0b1011010;   // 앞에 0b가 붙어있으면 2진수
        int var2 = 0206;        // 앞에 02가 붙어있는 수는 8진수
        int var3 = 926;         // 10진수
        int var4 = 0xAB;        // 앞에 0x(hexa의 약자)가 붙으면 16진수

        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);
        System.out.println("var3 : " + var3);
        System.out.println("var4 : " + var4);
    }
}
