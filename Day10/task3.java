import java.util.Random;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
Random rand = new Random();
        int num;

        while(true) {

            num = rand.nextInt(100) + 1; // 1 to 100
            System.out.println("Generated: " + num);

            if(num % 5 == 0 && num % 7 == 0) {
                System.out.println("Number divisible by 5 and 7 found: " + num);
                break;
            }
        }
    }
    
}
