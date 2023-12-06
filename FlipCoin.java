package Day5_LogicalProgram_pp;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of which you want to flip a coin");
        int numberOfFlip = sc.nextInt();
        float headCount = 0.0f;
        float tailCount = 0.0f;
        Random random = new Random();
        for(int i = 0; i < numberOfFlip; i++)
        {
            float randomFlipNumber = random.nextFloat()+0;
            if(randomFlipNumber <= 0.5)
            {
                headCount++;
            }
            else
            {
                tailCount++;
            }
        }
        double percentageOfHead = (headCount/(double)numberOfFlip)*100;
        double percentageOfTail = (tailCount/(double)numberOfFlip)*100;
        System.out.println("Percentage of head count: "+ percentageOfHead);
        System.out.println("Percentage of tail count: "+ percentageOfTail);

    }
}
