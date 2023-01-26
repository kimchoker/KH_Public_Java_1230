package CalenderEx;

import java.util.Calendar;

// Calender 클래스는 추상 클래스이므로 객체를 생성할 수 없음, 정적 메소드만 getInstance()메소드로 운영체제의 시간을 가져옴
// Calender 클래스가 포함된 모든 필드는 정적 변수
public class CalenderEx {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance(); // Date now = new Date();
//        System.out.print(now.get(Calendar.YEAR));
//        System.out.print(now.get(Calendar.MONTH) + 1);
//        // 달의 정보는 배열의 인덱스로 넘어오기 때문에 1을 더해주어야 실제 달과 같은 숫자를 얻을 수 있음
//        System.out.print(now.get(Calendar.DAY_OF_MONTH)); // 달에서 몇번째 날짜인지
//        System.out.print(now.get(Calendar.AM_PM));
//        System.out.print(now.get(Calendar.HOUR));
//        System.out.print(now.get(Calendar.MINUTE));
//        System.out.print(now.get(Calendar.SECOND));

        // yyyy년 MM월 dd HH시 mm분 ss초 형태를 Calendar 를 이용해 출력해보기
        int year = now.get(Calendar.YEAR);
        int mon = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int isPM = now.get(Calendar.AM_PM);
        int hour = now.get(Calendar.HOUR);
        int min = now.get(Calendar.MINUTE);
        int sec = now.get(Calendar.SECOND);
        if(isPM == 1) hour += 12;
        System.out.printf("%d년 %02d월 %02d일 %02d시 %02d분 %02d초\n", year, mon, day, hour, min, sec);
    }
}
