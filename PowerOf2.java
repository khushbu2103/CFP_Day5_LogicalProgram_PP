package Day5_LogicalProgram_pp;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        for (int i = 1; i <=num; i++)
        {
            //int powerOfTwo = Math.abs(num.);
            System.out.println("2^" + i + " = " + Math.pow(2,i));
        }

    }
}
