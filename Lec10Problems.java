import java.util.Scanner;

public class Lec10Problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size input: ");
        int size = sc.nextInt();
        // String[] names = new String[size];

        // // Input names 
        // for(int i=0; i<size; i++) {
        //     System.out.println("Enter a Name: ");
        //     names[i] = sc.next();
        // }

        // // output names 
        // for(int i=0; i<size; i++) {
        //     System.out.println(names[i]);
        // }


        /**
         * Q: Find the maximum & minimum number in an array of integers.
         */
        // int numbers[] = new int[size];
        // // input numbers 
        // for(int i=0; i<size; i++){
        //     System.out.println("Enter a number: ");
        //     numbers[i] = sc.nextInt();
        // }

        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;

        // for(int i=0; i<numbers.length; i++) {
        //     if(numbers[i] < min) {
        //         min = numbers[i];
        //     }

        //     if(numbers[i] > max) {
        //         max = numbers[i];
        //     }
        // }
        // System.out.println("Max value is: " + max);
        // System.out.println("Min value is: " + min);



        /**
         * Take an array of numbers as input and check if it is an array sorted in ascending order
         */
        int numbers[] = new int[size];
        // input numbers 
        for(int i=0; i<size; i++){
            System.out.println("Enter a number: ");
            numbers[i] = sc.nextInt();
        }

        int outputNum[] = new int[size];
        boolean isAssending = true;
        // Sorted array
        for(int i=0; i<numbers.length-1; i++) {
            if(numbers[i] > numbers[i]+1) {
                isAssending = false;
            }            
        }
        if(isAssending) {
            System.out.println("Array is stored in assending order.");
        }else {
            System.out.println("Array is not stored in assending order.");
        }

    }
}
