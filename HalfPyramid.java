public class HalfPyramid {
    public static void main(String[] args) {
        int n = 4;

        // // half pyramid
        // for(int i = 1;i <= n; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // Inverted Half pyramid
        // for(int i = n;i >= 1; i--){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Inverted half pyramid and roatete 180deg
        // for(int i = 1;i <= n; i++){
        //     for(int j = 1; j <= n-i; j++) {
        //         System.out.print(" ");
        //     }

        //     for(int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }


        // Print half pyramid with number
        for(int i = 1;i <= n;i++) {
            for(int j = 1;j <= i;j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
