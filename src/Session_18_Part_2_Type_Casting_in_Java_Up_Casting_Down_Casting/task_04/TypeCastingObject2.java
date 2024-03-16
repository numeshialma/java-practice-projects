package Session_18_Part_2_Type_Casting_in_Java_Up_Casting_Down_Casting.task_04;

class Parent {
    String name = "John";

    void m1(){
        System.out.println("This is m1 from Parent...");
    }
}

class Child extends Parent {
    int id  = 101;

    void m2(){
        System.out.println("This is m2 from Child...");
    }
}

public class TypeCastingObject2 {
    public static void main(String[] args) {

        Parent p = new Child();  // upcasting
        System.out.println(p.name);   // Parent
        p.m1();   // Parent

        /*
        System.out.println(p.id);   // Child
        p.m2();   // Child
         */
    }
}

