package Session_12_Java_OOPS_Concepts_Polymorphism_Encapsulation_Overloading.task_05;

public class Account {

    private int accountNo;
    private String name;
    private double amount;


    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
