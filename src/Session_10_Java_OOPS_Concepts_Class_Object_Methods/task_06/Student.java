package Session_10_Java_OOPS_Concepts_Class_Object_Methods.task_06;

public class Student {

    int sid;
    String sname= "Smith";  // not recommended
    char grade;

    void printData(){
        System.out.println(sid+ "  "+sname+"  "+grade);
    }
}
