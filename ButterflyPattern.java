public class ButterflyPattern {
    public static void main(String[] args) {
        int n=5;

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
    }
}
