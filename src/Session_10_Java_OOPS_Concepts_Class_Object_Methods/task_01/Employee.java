package Session_10_Java_OOPS_Concepts_Class_Object_Methods.task_01;

public class Employee {

    // Variables
    int eid;
    String ename;
    String job;
    int sal;

    // Methods
    void display(){
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(job);
        System.out.println(sal);
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee(); // object

        emp1.eid = 101;
        emp1.ename = "john";
        emp1.job = "Manager";
        emp1.sal=5000;

        emp1.display();


    }
}

//variables =  eid ename job salary