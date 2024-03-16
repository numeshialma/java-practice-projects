package Session_8_Working_with_Java_Strings_String_Methods.task_02;

public class Main1 {

    public static void main(String[] args) {

        String s1 = "welcome";
        String s2 = "to java";
        String s3 = " automation";

        System.out.println(s1+s2+s3);   // output : welcometo java automation

        System.out.println(s1.concat(s2).concat(s3));   // output : welcometo java automation

        System.out.println(s1.concat(s2+s3));   // output : welcometo java automation

        System.out.println("welcome"+"to java");   // output : welcometo java

        System.out.println("welcome".concat("to java"));   // output : welcometo java

    }
}
