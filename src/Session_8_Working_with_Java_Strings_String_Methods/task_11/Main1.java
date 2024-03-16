package Session_8_Working_with_Java_Strings_String_Methods.task_11;

public class Main1 {

    public static void main(String[] args) {

        String amount = "$15,20,55";    // expected output : 152055

        System.out.println(amount.replace("$",""));  // output : 15,20,55
        System.out.println(amount.replace("$","").replace(",",""));
        // output : 152055

        // System.out.println(amount.replace('$',''));  // not allowed



    }
}
