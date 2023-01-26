package 열거타입;

import java.util.Calendar;

public class EnumTypeEx {
    public static void main(String[] args) {
        Week today = null;
        Calendar cal = Calendar.getInstance(); // 추상 클래스
        int week = cal.get(Calendar.DAY_OF_WEEK); // 해당 주에 몇번째 날인지를 반환 일요일부터 시작

        switch (week) {
            case 1 :
                today = Week.Sunday; break;
            case 2 :
                today = Week.Monday; break;
            case 3 :
                today = Week.Tuesday; break;
            case 4 :
                today = Week.Wednesday; break;
            case 5 :
                today = Week.Thursday; break;
            case 6 :
                today = Week.Friday; break;
            case 7 :
                today = Week.Saturday; break;
        }
        System.out.println("오늘 요일은 : " + today);
    }
}
