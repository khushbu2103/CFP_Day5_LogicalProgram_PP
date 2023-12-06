package Day5_LogicalProgram_pp;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        double sum = 0;
        double harmonic1;
        for(int i = 1; i<=num; i++)
        {
            harmonic1 = (double) 1/i;
           // sum = sum + harmonic1;
            System.out.print(harmonic1+" ");
        }
    }
}
