package Session_14_Java_OOPS_Concepts_Inheritance_and_Types_of_Inheritance_in_Java.task_01;

class A {   // cannot use public
    int a = 100;
    void display(){
        System.out.println(a);
    }
}

class B extends A {
    int b = 200;
    void show(){
        System.out.println(b);
    }
}

public class InheritanceTypes {

    public static void main(String[] args) {

        B bobj = new B();

        System.out.println(bobj.a);
        System.out.println(bobj.b);

        /* output :
        100
        200
         */

        /*
        bobj.display();
        bobj.show();

         */

    }
}
