package Session_13_Java_OOPS_Concepts_Usage_of_this_and_static_keywords_in_Java.task_03;

public class StaticMain {

    public static void main(String[] args) {

        // 1.
        System.out.println(StaticDemo.a);
        StaticDemo.m1();

        // 2.
        StaticDemo sd = new StaticDemo();
        System.out.println(sd.b);
        sd.m2();

        // 3.
        sd.m();
    }
}
