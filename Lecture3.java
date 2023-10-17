import java.util.Scanner;

public class Lecture3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        String oper = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        


        // find Odd or Even 
        if(n %2 == 0) {
            System.out.println("even");
        }else {
            System.out.println("Odd");
        }

        // input 2 number a,b then (a==b) print equal, (a>b) print A is Greater, (a<b) print a is smaller
        if(a==b){
            System.out.println("A is equal.");
        } else if(a>b){
            System.out.println("Ais greater then b");
        } else if(a<b){
            System.out.println("a is smaller then b");
        }


        // Button with condition(first if else then convert switch)

        
        // Student score 
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


        /**
         * Calculator 
         */
        switch (oper) {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            case "%":
                System.out.println(a%b);
                break;
            default:
                System.out.println("Enter a valid number.");
        }
    }
}
