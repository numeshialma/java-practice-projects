package Session_15_Java_OOPS_Concepts_Method_Overriding_final_super_keywords_in_java.task_01;


class Bank {
    double roi(){   // rate of interest
        return 0;
    }
}

class ICICI extends Bank {
    double roi(){
        return 10.5;
    }
}

class SBI extends Bank {
    double roi(){
        return 11.5;
    }
}

public class OverRidingDemo {
    public static void main(String[] args) {

        ICICI ic = new ICICI();
        System.out.println(ic.roi());   // 10.5

        SBI sb = new SBI();
        System.out.println(sb.roi());   // 11.5
    }
}
