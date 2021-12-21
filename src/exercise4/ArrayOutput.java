package exercise4;

import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        for (int index = 0; index < numbers.length; index++) {
           System.out.println(numbers[index]); 
        }
    }

}
