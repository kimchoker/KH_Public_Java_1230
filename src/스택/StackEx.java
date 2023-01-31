package 스택;

import java.util.Scanner;
import java.util.Stack;

// LIFO : Last in first out , 프로그램의 메소드 호출 및 반환이 대표적인 스택 구조
// push(item) : 객체를 저장
// peek() : 스택 맨 위의 값을 확인
// pop() : 스택 맨 위의 값을 추출해서 보여줌
// empty() : Stack이 비어있는지 확인
// contains(값) : 매개변수로 전달한 값이 있는지 확인
// 괄호의 열림과 닫힘을 확인
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        System.out.println(stack.peek()); // 3
//        System.out.println(stack.pop()); // 맨 마지막 값을 추출
//        System.out.println(stack.empty()); // false 비어있지 않음으로
//        System.out.println(stack.size()); // 2
//        System.out.println(stack.contains(1)); // true
public class StackEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        System.out.print("수식 입력 : ");
        String exp = sc.next();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                if (!st.empty()) st.pop();
                else {
                    System.out.println("괄호가 일치하지 않습니다.");
                    return;
                }
            }
        }
        if (st.isEmpty()) {
            System.out.println("괄호가 일치합니다.");
        } else {
            System.out.println("괄호가 일치하지 않습니다.");
        }
    }
}
