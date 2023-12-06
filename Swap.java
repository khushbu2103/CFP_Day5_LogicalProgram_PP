package Day5_LogicalProgram_pp;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two digit");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Before swapping");
        System.out.println("first number: " + num1 + " & second number: " + num2);
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping");
        System.out.println("first number: " + num1 + " & second number: " + num2);
    }
}
