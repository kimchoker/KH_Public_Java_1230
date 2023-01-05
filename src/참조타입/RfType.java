package 참조타입;

public class RfType {
    /* public static void main(String[] args) {
        int [] x = null; // 참조하는 객체가 없다는 의미 */
    public static void main(String[] args) {
        String nameVal1 = "장욱";
        String nameVal2 = "장욱";
        String nameVal3 = new String( "장욱");

        if (nameVal1 == nameVal3) { // 참조하고 있는 위치를 비교
            System.out.println("nameVal1과 nameVal3가 참조가 같음");
        } else {
            System.out.println("nameVal1과 nameVal3가 참조가 다름");
        }
        if(nameVal1.equals(nameVal3)) { // 적혀있는 내용을 비교
            System.out.println("nameVal1과 nameVal3가 내용이 같음");
        }
    }
}
