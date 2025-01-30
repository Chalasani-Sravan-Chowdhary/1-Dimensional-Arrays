import java.util.Scanner;

public class OneDArrayUserinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms to find the Fibonacci series up to: ");
        int size = scanner.nextInt();
        

        //The condition for the size of array is declared here
        if (size <= 0) {
            System.out.println("Size of an array must be positive");
            return; 
            //Program is terminated here
        }

        // Declaring the isze of an 1D array
        int[] Numbers = new int[size]; 

        // Generating the Fibonacci series
        for (int i = 0; i < size; i++) {
            Numbers[i] = i+1; // Assigning consecutive integers
        }
        
        //Printing out the elements present in the array
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < Numbers.length; i++) {
            System.out.println("Numbers present in the array are  " + i + ": " + Numbers[i]);
        }

        System.out.println("Arithmatic opeerations on the elements present in the array");

        // Sum operations on the elemnets present in the array
        int sum = 0;
        for (int number : Numbers) {
            sum += number;
        }
        System.out.println("Sum of the elements: " + sum);


        //Difference operation on the elements present in the array
        int difference = 0;
        for (int number : Numbers) {
            difference -= number;
        }
        System.out.println("Difference of the elements: " + difference);


        //Multiplication operation on the elements present in the array
        int multiplication = 1;
        for (int number : Numbers) {
            multiplication *= number;
        }
        System.out.println("Multiplication of the elements: " + multiplication);
    }
}