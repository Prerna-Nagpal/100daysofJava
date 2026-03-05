// Day 3: Taking User Input in Java
import java.util.Scanner;
public class day3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string:");
        String name = sc.nextLine();
        System.out.println("You entered:"+name);
        sc.close();
}
}