import java.util.Scanner;

public class Lecture5 {
    public static void main(String[] args) {
        // Input section
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /**
         * Rectangle pattern print
         */
        System.out.println("Rectangle pattern print");
        for(int i = 0;i < 4; i++) {
            for(int j = 0;j < 20; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        /**
         * Hollow rectangle 
         */
        int m = 5;
        System.out.println("Hollow rectangle ");
        for(int i = 1;i <= n; i++) {
            for(int j = 1;j <= m;j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // half pyramid
        System.out.println("half pyramid");
        for(int i = 1;i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Inverted Half pyramid
        System.out.println("Inverted Half pyramid");
        for(int i = n;i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Inverted half pyramid and roatete 180deg
        System.out.println("Inverted half pyramid and roatete 180deg");
        for(int i = 1;i <= n; i++){
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        // Print half pyramid with number
        System.out.println("Print half pyramid with number");
        for(int i = 1;i <= n;i++) {
            for(int j = 1;j <= i;j++) {
                System.out.print(j);
            }

            System.out.println();
        }


        /**
         * Guess the output
         */
        // for(; ;) {
        //     System.out.println("Apna College");
        // }

        
    }
}
