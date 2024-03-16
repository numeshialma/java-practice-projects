package Session_13_Java_OOPS_Concepts_Usage_of_this_and_static_keywords_in_Java.task_02;

public class StaticDemo2 {

    static int a = 10;   // static variable
    int b = 20;   // non-static variable

    static void m1(){   // static method
        System.out.println("this is m1 static method..");
    }

    void m2(){   // non-static method
        System.out.println("this is m2 non-static method..");
    }

    void m(){   // non-static method
       // 3
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }

    public static void main(String[] args) {

        StaticDemo2 sd = new StaticDemo2();
        sd.m();   // in here we need to create an object
    }
}
