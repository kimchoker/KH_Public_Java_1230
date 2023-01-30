package 프로퍼티;

import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Properties;

// Properties : 내부의 정보 저장용으로 사용되며, 키와 값이 모두 String 타입으로 제한됨
// HashTable의 하위 클래스입니다.
// 디렉토리 설정시 ./ 하면 현재위치 ../ 하면 현재 위치보다 한단계 상위
// 상위로 갔다가 하위로 가려면 ../(폴더이름) 하면 상위로 올라간 뒤 하위폴더로 내려갈 수 있음
public class PropertiesEx {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        String path = Objects.requireNonNull(PropertiesEx.class.getResource("./database.properties")).getPath(); // 절대 경로를 가져옴
        path = URLDecoder.decode(path, StandardCharsets.UTF_8);
        properties.load(new FileReader(path));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("드라이버 : " + driver);
        System.out.println("URL : " + url);
        System.out.println("이름 : " + username);
        System.out.println("패스워드 : " + password);
    }
}
