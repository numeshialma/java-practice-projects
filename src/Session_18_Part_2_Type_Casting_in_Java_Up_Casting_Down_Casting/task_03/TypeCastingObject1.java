package Session_18_Part_2_Type_Casting_in_Java_Up_Casting_Down_Casting.task_03;

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

public class TypeCastingObject1 {
    public static void main(String[] args) {

        Child c = new Child();
        System.out.println(c.name);   // Parent
        c.m1();   // Parent
        System.out.println(c.id);   // Child
        c.m2();   // Child
    }
}

/*
Output :
    John
    This is m1 from Parent...
    101
    This is m2 from Child...
 */
