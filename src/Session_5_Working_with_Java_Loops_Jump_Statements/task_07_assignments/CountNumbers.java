package Session_5_Working_with_Java_Loops_Jump_Statements.task_07_assignments;

public class CountNumbers {

    public static void count(int x){

        String numberString = Integer.toString(x);
        char[] ch= numberString.toCharArray();
        int num = 0;

        for(int i=0; i<numberString.length(); i++){
            if(Character.isDigit(ch[i])){
                num++;
            }
        }
        System.out.println(" Number of digits : "+num);

    }

    public static void main(String[] args) {

        int numbers = 123699;
        count(numbers);

    }
}
