package Session_18_Part_2_Type_Casting_in_Java_Up_Casting_Down_Casting.task_05;

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

public class TypeCastingObject3 {
    public static void main(String[] args) {

        Parent p = new Parent();
        Child c = (Child) p;  // downcasting

        System.out.println(c.name);   // Parent
        c.m1();   // Parent

        System.out.println(c.id);   // Child
        c.m2();   // Child

    }
}
/* Run Time error :
Error : ClassCastException
Parent cannot be cast to class
 */

