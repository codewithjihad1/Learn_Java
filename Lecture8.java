import java.util.Scanner;

public class Lecture8 {
    /**
     * Q:- Enter 3 numbers from the user & make a function to print their average.
     * input 3 numbers and make a function to average calculate
     * @param args
     */
    public static int averageCalculator(int a,int b,int c) {
        int sum = a+b+c;
        int average = sum/3;
        
        return average;
    }

    /**
     * Q:- Write a function to print the sum of all odd numbers from 1 to n.
     * @param args
     */
    public static int calculateSumOfOdd(int n) {
        int sum = 0;
        for(int i=1; i<=n; i +=2) {
            sum += i;
        }
        return sum;
    }

    /**
     * Q:- Write a function which takes in 2 numbers and returns the greater of those two.
     * @param args
     */
    public static int greaterOfTwo(int a, int b){
        if(a > b){
            return a;
        }
        return b;
    
    }


    /**
     * Q:- Write a function that takes in the radius as input and returns the circumference of a circle.
     * @param args
     */
    public static float circleArea(int r){
        float pi = (float) 3.1416;
        float area = (pi * r*r);
        return area;
    }


    /**
     * Q:- Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
     * @param args
     */
    public static String isVoteAgeEligible(int age) {
        if(age > 18){
            return "You're eligible to vote.";
        }
        return "You're not eligible to vote";
    }

    /**
     * Q:- Write an infinite loop using do while condition.
     * @param args
     */
    public static void infiniteLoop(){
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i >0);
    }

    /**
     * Q:- Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
     * @param args
     */
    public static void userInputValCount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to continue and 0 to stop:");
        int input = sc.nextInt();

        int positive = 0, negative = 0, zeros = 0;

        while(input == 1) {
            System.out.println("Enter count number: ");
            int num = sc.nextInt();
            if(num > 0) {
                positive++;
            }else if(num < 0) {
                negative++;
            }else {
                zeros++;
            }

            System.out.println("Press 1 to continue and 0 to stop:");
            input = sc.nextInt();
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Nagative numbers: " + negative);
        System.out.println("Zeros : " + zeros);
    }







    // This is a main method in Java.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        userInputValCount();
    }
 }