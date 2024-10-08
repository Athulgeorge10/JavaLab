package lab24;
import java.util.Scanner;

public class ExceptionHandlingExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        int option;

        do {
            System.out.print("**MENU** \n1) Division \n2) Array  \nEnter option: ");
            option = sc.nextInt();
        
            switch (option) {
                case 1:
                    try {
                        System.out.println("Program to perform Division");
                        System.out.print("Enter number-1: ");
                        int num1 = sc.nextInt();
                        System.out.print("Enter number-2: ");
                        int num2 = sc.nextInt();
                        int result = num1 / num2;
                        System.out.println("Result = " + result);
                        System.out.println("End of try");
                    } catch (ArithmeticException e) {
                        System.out.println("Arithmetic Exception: " + e.getMessage());
                    } finally {
                        System.out.println("Finally block contents");
                        System.out.println("My code is safe from Exception");
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Enter the number of elements you want to store: ");
                        int arrayLength = sc.nextInt();
                        int[] array = new int[arrayLength];
                        System.out.print("Enter the elements of the array: ");
                        for (int i = 0; i < arrayLength; i++) {
                            array[i] = sc.nextInt();
                        }
                        System.out.println("Array length: " + arrayLength);
                        System.out.print("Array elements are: ");
                        for (int i = 0; i < arrayLength; i++) {
                            System.out.print(array[i] + "\t");
                        }
                        System.out.print("\nEnter the position of element to be accessed: ");
                        int pos = sc.nextInt();
                        System.out.println("Element at position " + pos + " is " + array[pos]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Array Index Out Of Bounds Exception: " + e.getMessage());
                    }
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }

            System.out.print("Do you want to continue (y/n)? : ");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("y"));

        sc.close();
    }
}
