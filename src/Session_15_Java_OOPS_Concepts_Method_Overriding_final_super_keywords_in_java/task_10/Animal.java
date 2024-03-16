package Session_15_Java_OOPS_Concepts_Method_Overriding_final_super_keywords_in_java.task_10;

public class Animal {

    String color = "white";

    void eat(){
        System.out.println("eating....");
    }

}


class Dog extends Animal {
    String color = "Black";

    void displayColor(){
        System.out.println(super.color);
    }

    void eat(){
        System.out.println("eating bread....");
    }
}