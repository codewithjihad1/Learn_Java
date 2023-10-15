import java.util.Scanner;

public class Lecture7 {
    // public static int calculateSum(int a, int b) {
    //     int sum = a + b;
    //     return sum;
    // }

    
    // Calculate Factorial
    public static void calculateFactorial(int n){
        // if user input a nagative value then stop calculate
        if(n < 0) {
            System.out.println("Invalid Number.");
            return;
        }
        
        int factorial = 1;

        for(int i =n; i >=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        calculateFactorial(a);
    }
}
