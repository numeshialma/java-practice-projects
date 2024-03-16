package Session_12_Java_OOPS_Concepts_Polymorphism_Encapsulation_Overloading.task_02;

public class Main1 {
    public static void main(String[] args) {

        Box box = new Box(10.5, 15.5, 5.0);   // will call 2
        System.out.println(box.volume());

        // output : 813.75
    }
}
