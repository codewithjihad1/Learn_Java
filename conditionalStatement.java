import java.util.Scanner;

public class conditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        String oper = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();

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
