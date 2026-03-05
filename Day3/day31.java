// Reading different data types input from java
import java.util.Scanner;

public class day31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int num = sc.nextInt();
        System.out.print("Enter a decimal number:");
        double decimal = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Ouptuts:");
        System.out.println("Integer: " + num);
        System.out.println("Decimal: " + decimal);
        System.out.println("Name: " + name);

        sc.close();
    }
}
