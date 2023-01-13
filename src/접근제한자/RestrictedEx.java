package 접근제한자;
// 접근제한자란 객체지향의 4개자 특징 중 하나이며 데이터은닉과 캡슐화의 핵심 개념입니다.
// 데이터은닉이란 사용자가 알 필요가 없거나 숨겨야 할 정보를 보이지 않도록 하는 것
// 대형 프로젝트 진행 중에는 필드값이 외부에서 접근 가능하게 되어있는 경우 여러 문제점이 발생할 수 있다.
public class RestrictedEx {
    public static void main(String[] args) {
        ChildRest childRest = new ChildRest();
        childRest.getMoney();
        System.out.println(childRest.name);
    }
}
    class ChildRest extends ParentRest{
        String jobs;
        public  String getJobs() {
            return jobs;
        }
        public  void setJobs(String jobs) {
            this.jobs = jobs;
        }
        public String getMoney() { // protected 에 대한 접근 (동일 패키지와 상속과 성립하면 접근 허용)
            return money;
        }
        public String getName() { // default 에 대한 접근 (동일 패키지만 접근 허용)
            return name;
        }
        public String getAddr() {
            return addr;
        }
    }

