package 배열의응용;

import java.util.Arrays;

// 배열의 복사 : 원칙적으로 자바에서 배열은 한번 생성하면 크기를 변경할 수 없음
// 그러나 배열의 복사를 통해 크기를 변경할 수 있다.
public class ArrayApp {
    public static void main(String[] args) {
        // arraycopy() : 배열 값을 복사할 때 사용
        // System.arraycopy(Object.src, int srcPos, Object dest, int destPos, int length);
//        int[] arr1 = {1,2,3,4,5};
//        int len = 10;
//        int[] arr2 = new int[len];
//        arr2[0] = 100;
//        arr2[1] = 200;
//        arr2[2] = 300;
//
//        System.arraycopy(arr1,0,arr2,4,arr1.length);
//        for(int e : arr2) System.out.println(e);


        // copyOf() : 배열을 원하는 길이만큼 새로운 길이로 복사
//        int[] arr1 = {1,2,3,4,5};
//        int[] arr2 = Arrays.copyOf(arr1, 10);
//        for(int e : arr2) System.out.print(e + " ");

        //얕은 복사와 깊은 복사
        int[] arr1 = {1,2,3,4};
        int[] arr2 = new int[arr1.length];
        //System.arraycopy(arr1, 0, arr2, 0, arr1.length); // 실제 값이 복사되므로 깊은 복사에 해당한다.
        // int[] arr2 = Arrays.copyOf(arr1, arr1.length); // 실제 값이 복사되는 깊은 복사
        // int[] arr2 = arr1; // 여기서 주소가 복사되기 때문에 얕은 복사가 일어난다.

        for(int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        } // 이것도 깊은 복사

        arr1[0] = 100;
        for(int e : arr1) System.out.print(e + " ");
        System.out.println();

        for(int e : arr2) System.out.print(e + " ");
    }
}
