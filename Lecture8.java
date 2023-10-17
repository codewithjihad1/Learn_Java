import java.util.*;

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


    /**
     * Q:- Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e..
     * Description: input two value and x power n (x^n)
     * @param args
     */
    public static int calculateExpo(int x, int n){
        int result = (int) Math.pow(x, n);
        return result;
    }   


    /**
     * Q:- Write a function that calculates the Greatest Common Divisor of 2 numbers.
     * @param args
     */
    public static String findGCD(int a, int b) {
        int gcd = 1;
        for(int i=1; i <= a && i <= b; i++) {
            if(a%i == 0 && b%i ==0) {
                gcd = i;
            }
        }

        return "Greatest Common Divider is: " + gcd;
    }


    /**
     * Q:- Write a program to print Fibonacci series of n terms where n is input by user :0 1 1 23581321.....
     * @param args
     */
    public static void fibonacciSeries(int n) {
        int a = 0, b = 1;
        // check nagative value
        if(n > 1) {
            System.out.print(a +" ");
            for(int i=2; i <=n; i++) {
                System.out.print(b + " ");
                int temp = b;
                b = a + b;
                a = temp;
            }
        }
    }

    // This is a main method in Java.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // int b = sc.nextInt();

        // System.out.println(fibonacciSeries(a));
        fibonacciSeries(a);
    }
 }