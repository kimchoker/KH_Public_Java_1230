import java.util.Scanner;

 /*public class sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("암호를 입력하세요");
            String password = sc.next();
            if (password.equalsIgnoreCase("exit") || password.equalsIgnoreCase("종료")) return;

            if (password.length() < 10 || password.length() > 30) {
                System.out.println("길이");
            } else {
                for (int i = 0; i < password.length(); i++) {
                    int num = password.charAt(i);

                    if (num == 33 || num == 35 || num == 37 || num == 38 || num == 42 || num == 43 || num == 45 || num == 47 || num == 95) {
                        if (num <= 90 && 65 <= num) /* 대문자  {
                         /*   if (num >= 97 && 122 >= num) /* 소문자  {
                      /*          if (48 <= num && 57 >= num) /* 숫자
                /*                    System.out.println("Good Password");
                                } else if (i == password.length()) {
                                    System.out.println("숫자 없음");
                                } else if (i == password.length()) {
                                    System.out.println("소문자 없음");
                                }

                            } else if (i == password.length() - 1) {
                                System.out.println("대문자 없음");
                            }
                        } else if (i == password.length()) {
                            System.out.println("특문 없음");
                        }
                    }
                }
            }
        }
    }
}
*/