package Date클래스;
// Date 클래스 : 1970년 1월 1일 0시 0분 0초로부터 ms 단위로 경과 시간을 운영체제로부터 받아옴
// SimpleDateFormat 클래스 : 얻어낸 시간 정보를 우리가 원하는 날짜/시간 포맷으로 변환하여 출력해줌

import java.text.SimpleDateFormat;
import java.util.Date;
// yy : 연도를 4자리로 표현 2023/ yy : 연도를 2자리로 표현 23
// MM : 월을 표시. 한자리수대의 월은 앞에 0 포함. 반드시 대문자로 표현되어야 함
// mm : 분을 표시. 한자리수대의 분은 앞에 0 포함.
// HH : 24시간제 표시
// hh : 12시간제 표시
// W : 월에서 몇주차인지 표시
// w : 년에서 몇주차인지 표시

import static java.lang.Thread.sleep;

public class DateEx1 {
    public static void main(String[] args) throws InterruptedException {

        while (true) {
            Date now = new Date(); // Date 클래스로 객ㅊ체를 생성 후 사용해야 함.
            SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd hh:mm:ss");
//            SimpleDateFormat f1, f2, f3, f4, f5, f6, f7;
//            f1 = new SimpleDateFormat("yyyy-MM-dd");
//            f2 = new SimpleDateFormat("yy/MM/dd");
//            f3 = new SimpleDateFormat("yyyy년 MM월 dd일");
//            f4 = new SimpleDateFormat("HH:mm:ss");
//            f5 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//            f6 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날 입니다.");
//            f7 = new SimpleDateFormat("오늘은 yyyy년 w주차 입니다.");
//            System.out.println(f1.format(now));
//            System.out.println(f2.format(now));
//            System.out.println(f3.format(now));
//            System.out.println(f4.format(now));
//            System.out.println(f5.format(now));
//            System.out.println(f6.format(now));
//            System.out.println(f7.format(now));
            String strDate = sdf.format(now);
            System.out.print(strDate);
            sleep(1000);
            System.out.print("\r");

        }

    }
}
