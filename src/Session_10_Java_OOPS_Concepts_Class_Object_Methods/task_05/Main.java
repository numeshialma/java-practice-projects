package Session_10_Java_OOPS_Concepts_Class_Object_Methods.task_05;

public class Main {
    public static void main(String[] args) {

        Student stu1 = new Student();

        stu1.sid = 101;
        stu1.sname = "Smith";
        stu1.grade = 'A';

        stu1.printData();


        Student stu2 = new Student();

        stu2.sid = 101;
        stu2.sname = "Smith";
        stu2.grade = 'A';

        stu2.printData();
    }
}
