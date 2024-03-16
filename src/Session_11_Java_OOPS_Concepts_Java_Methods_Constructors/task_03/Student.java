package Session_11_Java_OOPS_Concepts_Java_Methods_Constructors.task_03;

public class Student {

    int sid;
    String sname;
    char grad;

    Student(int id, String name, char gr){
        sid = id;
        sname = name;
        grad = gr;
    }

    void setStudentData(int id, String name, char gr){
        sid = id;
        sname = name;
        grad = gr;
    }


}
