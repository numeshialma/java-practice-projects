package Session_11_Java_OOPS_Concepts_Java_Methods_Constructors.task_01;

public class Main {
    public static void main(String[] args) {

        Greeting gr = new Greeting();
        gr.m1();    // 1.

        String s = gr.m2();
        System.out.println(s);   // 2.

        gr.m3("John");   // 3.

        String var = gr.m4("David");
        System.out.println(var);  // 4.

    }
}
