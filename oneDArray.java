public class oneDArray {
    public static void main(String[] args) {
        //The size of array is declared as 5
        int size=5;
        int[] numbers = new int[size]; 
        // Assigning values to the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
    
        System.out.println("Elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Numbers present in the array are  " + i + ": " + numbers[i]);
        }

        System.out.println("Arithmatic opeerations on the elements present in the array");

        // Sum operations on the elemnets present in the array
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of the elements: " + sum);


        //Difference operation on the elements present in the array
        int difference = 0;
        for (int number : numbers) {
            difference -= number;
        }
        System.out.println("Difference of the elements: " + difference);


        //Multiplication operation on the elements present in the array
        int multiplication = 1;
        for (int number : numbers) {
            multiplication *= number;
        }
        System.out.println("Multiplication of the elements: " + multiplication);
    }
}

