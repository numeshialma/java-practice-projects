package Session_14_Java_OOPS_Concepts_Inheritance_and_Types_of_Inheritance_in_Java.task_03;


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

class C extends B {
    int c = 300;
    void print(){
        System.out.println(c);
    }
}

public class InheritanceTypes {

    public static void main(String[] args) {

        C cobj = new C();

        System.out.println(cobj.a);
        System.out.println(cobj.b);
        System.out.println(cobj.c);

        cobj.display();
        cobj.show();
        cobj.print();

        
        /* output :
        100
        200
        300
        100
        200
        300
         */

    }
}
