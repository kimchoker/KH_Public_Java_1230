package ArrayList응용;

import java.util.ArrayList;
import java.util.List;

public class ArrListT3 {
    public static void main(String[] args) {
        List<MemberInfo> memList = new ArrayList<>();
        memList.add(new MemberInfo("김준혁", "seolet", "123123",
                "safad@naver.com", "01044567756", 27));
        memList.add(new MemberInfo("유경연", "yeonni", "123123",
                "udsd@naver.com", "01047786756", 24));
        memList.add(new MemberInfo("이주문", "zoomoom1", "1154123",
                "aayd@naver.com", "01044567756", 21));

        for(MemberInfo info : memList) {
            info.viewInfo();
        }
    }
}
