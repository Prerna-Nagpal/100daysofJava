import java.util.Scanner;

public class day32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        System.out.print("Enter a float value: ");
        float f = sc.nextFloat();

        System.out.print("Enter a word: ");
        String word = sc.next();

        sc.nextLine(); // consume newline

        System.out.print("Enter a full sentence: ");
        String sentence = sc.nextLine();

        System.out.println("\n--- Output ---");
        System.out.println("Integer: " + num);
        System.out.println("Float: " + f);
        System.out.println("Word: " + word);
        System.out.println("Sentence: " + sentence);

        sc.close();
    }
}