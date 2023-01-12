package Person상속;
// 인간(person) 클래스 만들기
// - age(정수값 : 나이) : 필드와 세터/게터
// - sleep (정수값 : 시간) : 필드와 세터/게터
// 인간의 특성을 상속받아 직장인 만들기
// - worker (정수값 : 근무시간을 의미) : 필드와 세터/게터
// 인간의 특성을 상속받아 학생 만들기
// - 공부한다 (열심히/적당히/놀면서) : 필드와 세터/게터
public class PersonInheritance {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.setWork(8);
        worker.setAge(27);
        worker.setSleep(8);
        System.out.println("직장인은 " + worker.getWork() + "시간동안 일을 합니다.");
        System.out.println("직장인은 " + worker.getAge() + "살 입니다.");
        System.out.println("직장인은 " + worker.getSleep() + "시간 잠을 잡니다.");

        Student student = new Student();
        student.setStudy(3);
        student.setAge(16);
        student.setSleep(8);
        System.out.println("학생은 " + student.getStudy() + "공부 합니다.");
        System.out.println("학생은 " + student.getAge() + "살 입니다.");
        System.out.println("학생은 " + student.getSleep() + "시간동안 잠을 잡니다.");


    }
}


