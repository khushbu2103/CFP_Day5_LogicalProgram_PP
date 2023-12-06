package Day5_LogicalProgram_pp;

import java.util.Scanner;

public class Quotient_Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int quotient = 0;
        int remainder = 0;
        quotient = num1/num2;
        remainder = num1%num2;
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
