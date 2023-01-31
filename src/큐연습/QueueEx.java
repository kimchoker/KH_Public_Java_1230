package 큐연습;

import java.util.LinkedList;
import java.util.Queue;

// FIFO 구조이며 LinkedList를 활용하여 생성함 LinkedList의 메소드 중 Queue의 구현에 필요한 기능만 사용할 수 있음
// add(E e) : 큐의 맨 뒤에 요소를 추가
// peek() : 큐의 맨 앞에 있는 요소를 반환
// remove() : 큐의 맨 앞에 있는 요소를 반환
// boolean offer(Object o) : 큐의 맨 뒤에 객체를 삽입
// Object poll() : 큐의 맨 앞 객체를 꺼냄
// Object element() : 삭제 없이 요소를 읽어옴
public class QueueEx {
    public static void main(String[] args) {
        Queue<Message> msgQueue = new LinkedList<>();
        msgQueue.offer(new Message("Mail", "경연"));
        msgQueue.offer(new Message("SMS", "경연"));
        msgQueue.offer(new Message("kakaotalk", "경연"));

        while (!msgQueue.isEmpty()) {
            Message msg = msgQueue.poll();
            switch (msg.command) {
                case "Mail" :
                    System.out.println(msg.to + "에게 메일을 보냅니다.");
                case "SMS" :
                    System.out.println(msg.to + "에게 문자를 보냅니다.");
                case "kakaotalk" :
                    System.out.println(msg.to + "에게 카카오톡을 보냅니다.");

            }
        }
    }
}

class Message {
    String command;
    String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }
}