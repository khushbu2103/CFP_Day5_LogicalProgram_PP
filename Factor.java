package Day5_LogicalProgram_pp;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();

        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
                // factor = i;
            }
        }
        if (num > 1) {
            System.out.print(num);
        }
    }
}
