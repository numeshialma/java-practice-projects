package Session_10_Java_OOPS_Concepts_Class_Object_Methods.task_03;

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

        System.out.println(emp1.eid);
        // emp1.display();

        Employee emp2 = new Employee(); // another object
        emp2.eid = 102;
        emp2.ename = "David";
        emp2.job = "Engineer";
        emp2.sal = 3000;

        emp2.display();
    }
}
