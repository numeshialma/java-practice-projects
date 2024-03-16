package Session_12_Java_OOPS_Concepts_Polymorphism_Encapsulation_Overloading.task_06;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account();

        acc.setAccountNo(101);
        acc.setName("John");
        acc.setAmount(2003);

        System.out.println(acc.getAccountNo());
        System.out.println(acc.getName());
        System.out.println(acc.getAmount());
    }
}
/*
101
John
2003.0
 */