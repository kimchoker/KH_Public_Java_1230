package 입출력실습;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class InOutPrEx {
    public static void main(String[] args) throws IOException {

        TreeSet<Student> rst = new TreeSet<>();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/입출력실습/Score.txt"); // 파일을 읽어옴
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(fis);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] split = line.split(" ");
            rst.add(new Student(split[0],
                    Integer.parseInt(split[1]),
                    Integer.parseInt(split[2]),
                    Integer.parseInt(split[3])));
        }
        for (Student student : rst) {
            System.out.println(student.name + " : " + (student.getTotal()));
        }
        fis.close();
    }
}

