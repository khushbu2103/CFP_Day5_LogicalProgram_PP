package Day5_LogicalProgram_pp;

import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet");

        char alphabet = sc.next().charAt(0);
        if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == '0' || alphabet == 'u' || alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U')
        {
            System.out.println(alphabet + " is vowel");
        }
        else
        {
            System.out.println(alphabet + " is consonant");
        }

    }

}
