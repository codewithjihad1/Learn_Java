import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNum = sc.nextInt();

        if(userNum == 1) {
            int score = sc.nextInt();
            
            if(score >= 90) {
                System.out.println("This is good.");
            }else if(score <= 89 && score >= 60) {
                System.out.println("This is also good.");
            }else if(score <= 59 && score >= 0) {
                System.out.println("This is good as will.");
            }else {
                System.out.println("Invalid numbers.");
            }
        }
    }
}
