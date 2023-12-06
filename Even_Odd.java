package Day5_LogicalProgram_pp;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        if(num%2 == 0)
        {
            System.out.println(num + " is Even number");
        }
        else
        {
            System.out.println(num + " is Odd number");
        }
    }
}
