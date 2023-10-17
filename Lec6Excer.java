public class Lec6Excer {
    public static void main(String[] args) {
        int n = 5;
        /**
         * Hollow butterfly pattern print 
         */
        // Butterfly Half
        for(int i=1; i<=n; i++){
            // Half pyramid
            for(int j=1; j<=i; j++){
                if(j==1 || j==i) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            // spaces calculate 
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }

            // Half pyramid inverted
            for(int j=1; j<=i; j++){
                if(j==1 || j==i) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // Butterfly half inverted
        for(int i=n; i>=1; i--){
            // Half pyramid
            for(int j=1; j<=i; j++){
                if(j==1 || j==i) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            // spaces calculate 
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }

            // Half pyramid inverted
            for(int j=1; j<=i; j++){
                if(j==1 || j==i) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        /**
         * Hollow Butterfly end
         */



         // Butterfly pattern 
        // Butterfly Upper half
        // for(int i = 1; i <= n; i++) {
        //     for(int j=1; j <= i; j++) {
        //         System.out.print("*");
        //     }

        //     // Print spaces 
        //     for(int j=1; j <= 2*(n-i); j++) {
        //         System.out.print(" ");
        //     }

        //     for(int j=1; j <= i; j++) {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

        // // lower half
        // for(int i = n; i >= 1; i--) {
        //     for(int j=1; j <= i; j++) {
        //         System.out.print("*");
        //     }

        //     // Print spaces 
        //     for(int j=1; j <= 2*(n-i); j++) {
        //         System.out.print(" ");
        //     }

        //     for(int j=1; j <= i; j++) {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }
        // Butterfly end


        // // Solid rombus
        // for(int i=1; i<=n; i++) {
        //     int spaces = n-i;
        //     for(int j=1; j<=spaces; j++) {
        //         System.out.print(" ");
        //     }

        //     for(int j=1; j <= 5; j++) {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }


        // Number pyramid 
        // for(int i=1; i<=n; i++){
        //     int spaces = n-i;
        //     for(int j=1; j<=spaces;j++) {
        //         System.out.print(" ");
        //     }

        //     for(int j=1; j<=i; j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        // Palindromic pyramid 
        System.out.println("Palindromic pyramid pattern");
        for(int i=1; i<=n; i++) {
            // Print spaces 
            int spaces = n-i;
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            // first half palindrome
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }
            // second half palindrome
            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        // Dimond pattern 
        System.out.println("Dimond pattern");
        // half dimond
        for(int i=1; i<=n; i++) {
            // spaces print 
            int spaces = n-i;
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=2; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        // half dimond inverted
        for(int i=n; i>=1; i--) {
            // spaces print 
            int spaces = n-i;
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=2; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }



        // hollow rombus 
        System.out.println("Hollow rombus");
        for(int i=1; i<=n; i++){
            // spaces print 
            int spaces = n-i;
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=5; j++){
                if(i==1 || i==n || j==1 ||j==5){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }


        // Inverted half pyramid
        System.out.println("Inverted half pyramid");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i)+1; j++){
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
