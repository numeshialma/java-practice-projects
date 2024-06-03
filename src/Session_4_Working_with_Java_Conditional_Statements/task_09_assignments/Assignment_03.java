package Session_4_Working_with_Java_Conditional_Statements.task_09_assignments;

public class Assignment_03 {
    public static void main(String[] args) {
        String weekName = "Wednesday";
        int weekNumber;

        switch (weekName.toLowerCase()) {
            case "monday":
                weekNumber = 1;
                break;
            case "tuesday":
                weekNumber = 2;
                break;
            case "wednesday":
                weekNumber = 3;
                break;
            case "thursday":
                weekNumber = 4;
                break;
            case "friday":
                weekNumber = 5;
                break;
            case "saturday":
                weekNumber = 6;
                break;
            case "sunday":
                weekNumber = 7;
                break;
            default:
                weekNumber = -1; // If the input is not a valid week name
        }

        System.out.println("Week number for " + weekName + " is: " + weekNumber);
    }
}
