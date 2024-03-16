package Session_12_Java_OOPS_Concepts_Polymorphism_Encapsulation_Overloading.task_01;

public class Main {
    public static void main(String[] args) {

        Adder addobj = new Adder();

        addobj.sum();   // 1 method     // output : 30

        addobj.sum(100,200);   // 2 method     // output : 300

        addobj.sum(10,15.5);   // 3 method     // output : 25.5

        addobj.sum(10.5,20);   // 4 method     // output : 30.5

        addobj.sum(10,20,30);    //  output : 60

    }
}
